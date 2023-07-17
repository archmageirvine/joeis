package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048671 a(n) is the least common multiple of the proper divisors of n.
 * @author Sean A. Irvine
 */
public class A048671 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A048671(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A048671() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z lcm = Z.ONE;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!d.equals(mN)) {
        lcm = lcm.lcm(d);
      }
    }
    return lcm;
  }
}
