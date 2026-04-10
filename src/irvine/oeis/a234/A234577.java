package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A234577 Let S_n = 0 followed by base-2 expansion of n, reversed; sequence is concatenation of S_0, S_1, S_2, ...
 * @author Georg Fischer
 */
public class A234577 extends AbstractSequence {

  private long mK;
  private int mBase;
  private final StringBuffer mSb = new StringBuffer("00000000");
  private int mPos; // index in mSb

  /** Construct the sequence. */
  public A234577() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param base
   */
  public A234577(final int offset, final int base) {
    super(offset);
    mBase = base;
    mSb.setLength(0);
    mK = -1;
    mPos = -1;
  }

  @Override
  public Z next() {
    if (mPos <= 0) {
      mSb.setLength(0);
      mSb.append(Long.toString(++mK, mBase));
      mPos = mSb.length();
      return Z.ZERO;
    }
    return Z.valueOf(Character.digit(mSb.charAt(--mPos), 10));
  }
}
