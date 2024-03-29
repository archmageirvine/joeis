package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003159 Numbers whose binary representation ends in an even number of zeros.
 * @author Sean A. Irvine
 */
public class A003159 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003159(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003159() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if ((Long.numberOfTrailingZeros(mN) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }

}
