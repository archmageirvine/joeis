package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027377 Number of irreducible polynomials of degree n over GF(4); dimensions of free Lie algebras.
 * @author Sean A. Irvine
 */
public class A027377 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027377(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A027377() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final Z z = Z.ONE.shiftLeft(2L * d);
      sum = sum.add(z.multiply(Functions.MOBIUS.i(mN / d)));
    }
    return sum.divide(mN);
  }
}
