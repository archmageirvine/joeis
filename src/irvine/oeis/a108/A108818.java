package irvine.oeis.a108;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A108818 Primes such that the outer 2 digits are n and n+1 and all inner digits are 1, where 0 &lt; n &lt; 9.
 * @author Georg Fischer
 */
public class A108818 extends AbstractSequence {

  private final int[] mRange;
  private final int mLen;
  private final char mDigit;
  private final int mIncrement;
  private int mRix; // index in sRange 
  private final StringBuffer mInner;

  /** Construct the sequence. */
  public A108818() {
    this(1, 1, +1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param inner inner digit
   * @param increment +1 if last digit is n+1, -1 if last digit is n-1
   */
  public A108818(final int offset, final int inner, final int increment) {
    super(offset);
    mInner = new StringBuffer();
    mDigit = Character.forDigit(inner, 10);
    mIncrement = increment;
    mRange = new int[] {2, 5 + mIncrement, 8};
    mLen = mRange.length;
    mRix = mLen;
  }

  @Override
  public Z next() {
    while (true) {
      ++mRix;
      if (mRix >= mLen) {
        mRix = 0;
        mInner.append(mDigit);
      }
      final int r = mRange[mRix];
      final Z p = new Z(String.valueOf(r) + mInner.toString() + String.valueOf(r + mIncrement));
      if (Predicates.PRIME.is(p)) {
        return p;
      }
    }
  }
}
