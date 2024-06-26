package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027376 Number of ternary irreducible monic polynomials of degree n; dimensions of free Lie algebras.
 * @author Sean A. Irvine
 */
public class A027376 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027376(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A027376() {
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
      final Z z = Z.THREE.pow(d);
      sum = sum.add(z.multiply(Functions.MOBIUS.i(mN / d)));
    }
    return sum.divide(mN);
  }
}
