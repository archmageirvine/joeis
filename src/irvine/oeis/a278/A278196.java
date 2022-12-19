package irvine.oeis.a278;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;

/**
 * A278196 Partition numbers (A000041) of the form 2^2 * k for odd k.
 * @author Georg Fischer
 */
public class A278196 extends Sequence1 {

  private int mExpon;
  private A000041 mSeq1 = new A000041();

  /** Construct the sequence. */
  public A278196() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param expon power of 2
   */
  public A278196(final int expon) {
    mExpon = expon;
  }

  @Override
  public Z next() {
    while (true) {
      final Z part = mSeq1.next();
      if (part.getLowestSetBit() == mExpon) {
        return part;
      }
    }
  }
}
