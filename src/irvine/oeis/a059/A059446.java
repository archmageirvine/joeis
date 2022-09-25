package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059446 Triangle T(n,k) = coefficient of x^n*y^k/(n!*k!) in 1/(1-x-y-x*y), read by rows in order 00, 10, 01, 20, 11, 02, ...
 * @author Sean A. Irvine
 */
public class A059446 implements Sequence {

  private Polynomial<Polynomial<Q>> mEgf;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, mN + 1);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
      if (++mN == 0) {
        mEgf = ring.one();
      } else {
        final Polynomial<Q> s = Polynomial.create(Q.ONE, Q.NEG_ONE);
        final Polynomial<Q> t = Polynomial.create(Q.NEG_ONE, Q.NEG_ONE);
        mEgf = ring.series(ring.one(), ring.create(Arrays.asList(s, t)), mN);
      }
      mM = 0;
    }
    return mEgf.coeff(mM).coeff(mN - mM).multiply(MemoryFactorial.SINGLETON.factorial(mN - mM)).multiply(MemoryFactorial.SINGLETON.factorial(mM)).toZ();
  }
}
