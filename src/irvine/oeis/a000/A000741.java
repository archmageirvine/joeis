package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000741 Number of compositions of n into 3 ordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A000741 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000741(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000741() {
    super(1);
  }

  private long mN = 0;

  protected Z p(final Z n) {
    return n.subtract(2).multiply(n.subtract(1)).divide2();
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(p(d).multiply(Mobius.mobius(mN / d.longValue())));
    }
    return sum;
  }
}
