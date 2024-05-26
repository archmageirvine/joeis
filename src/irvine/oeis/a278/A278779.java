package irvine.oeis.a278;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;

/**
 * A278779 Numbers m such that A000041(m) is of the form 2^2 * k for odd k.
 * @author Georg Fischer
 */
public class A278779 extends Sequence1 {

  private int mN;
  private final int mExpon;
  private final A000041 mSeq1 = new A000041();

  /** Construct the sequence. */
  public A278779() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param expon
   */
  public A278779(final int expon) {
    mN = -1;
    mExpon = expon;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z part = mSeq1.next();
      if (part.getLowestSetBit() == mExpon) {
        return Z.valueOf(mN);
      }
    }
  }
}
