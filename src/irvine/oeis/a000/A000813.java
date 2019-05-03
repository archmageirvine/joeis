package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A000813 Expansion of (sin <code>x +</code> cos <code>x)/cos 4x</code>.
 * @author Sean A. Irvine
 */
public class A000813 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> FOUR = RING.create(Arrays.asList(Q.ZERO, new Q(4)));
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> cs = RING.add(RING.cos(RING.x(), mN), RING.sin(RING.x(), mN));
    final Polynomial<Q> c4 = RING.cos(FOUR, mN);
    final Polynomial<Q> gf = RING.series(cs, c4, mN);
    return gf.coeff(mN).multiply(mF.factorial(mN)).toZ();
  }
}
