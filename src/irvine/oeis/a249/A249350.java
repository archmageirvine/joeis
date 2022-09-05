package irvine.oeis.a249;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000040;

/**
 * A249350 Prime numbers Q such that the concatenation Q, 6,Q is prime.
 * @author Georg Fischer
 */
public class A249350 extends A000040 implements SequenceWithOffset {

  private int mOffset;
  private String mMiddle;

  /** Construct the sequence. */
  public A249350() {
    this(1, 6);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param middle digit in the middle of the concatenation
   */
  public A249350(final int offset, final int middle) {
    mOffset = offset;
    mMiddle = String.valueOf(middle);
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final String primeStr = prime.toString();
      if (new Z(primeStr + mMiddle + primeStr).isProbablePrime()) {
        return prime;
      }
    }
  }
}
