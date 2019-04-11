package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A001495 Number of symmetric <code>0-1 (n+1)</code> X <code>(n+1)</code> matrices with row sums 2 and first row starting <code>1,1</code> for <code>n&gt;0, a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A001495 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Arrays.asList(Q.ZERO, new Q(-2), Q.THREE, Q.ONE));
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(new Q(4), new Q(-4)));
  private static final Polynomial<Q> D = RING.create(Arrays.asList(Q.ZERO, new Q(-3), Q.THREE, Q.NEG_ONE));

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> exp = RING.exp(RING.series(NUM, DEN, mN), mN);
    //System.out.println(exp);
    final Polynomial<Q> sqrt = RING.sqrt1p(D, mN);
    //System.out.println(sqrt);
    final Polynomial<Q> integrand = RING.series(exp, sqrt, mN);
    //System.out.println(integrand);
    final Polynomial<Q> egf = RING.integrate(integrand);
    //System.out.println(egf);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
