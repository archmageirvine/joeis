package irvine.oeis.a007;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000669;

/**
 * A007827 Number of homeomorphically irreducible (or series-reduced) trees with n pendant nodes, or continua with n non-cut points, or leaves.
 * @author Sean A. Irvine
 */
public class A007827 extends A000669 {

  /** Construct the sequence. */
  public A007827() {
    super(0);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, 1);
  private Polynomial<Z> mB = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mB = RING.add(mB, RING.monomial(super.next(), mN));
    return RING.multiply(RING.subtract(X1, mB), mB, mN).coeff(mN);
  }
}
