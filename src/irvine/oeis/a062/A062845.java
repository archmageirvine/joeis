package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A062845 When expressed in base 2 and then interpreted in base 3, is a multiple of the original number.
 * @author Georg Fischer
 */
public class A062845 extends AbstractSequence {

  private long mN;
  private final int mBase1;
  private final int mBase2;

  /** Construct the sequence. */
  public A062845() {
    this(1, 2, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base1 first base
   * @param base2 second base
   */
  public A062845(final int offset, final int base1, final int base2) {
    super(offset);
    mN = -1;
    mBase1 = base1;
    mBase2 = base2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long t = Long.parseLong(Long.toString(mN, mBase1), mBase2);
      if (t == 0 || t % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
