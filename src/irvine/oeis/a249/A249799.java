package irvine.oeis.a249;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A249799 a(n+1) is the next smallest nontrivial cube beginning with a(n), initial term is 3.
 * @author Georg Fischer
 */
public class A249799 extends AbstractSequence {

  private long mN;
  private final int mStart;
  private final int mExponent;
  private String mS = "";

  /** Construct the sequence. */
  public A249799() {
    this(1, 3, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param exponent 3 or 2
   * @param start value of <code>a(1)</code>
   */
  public A249799(final int offset, final int exponent, final int start) {
    super(offset);
    mExponent = exponent;
    mStart = start;
    mN = -1;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mS = String.valueOf(mStart);
      return Z.valueOf(mStart);
    }
    while (true) {
      ++mN;
      final Z t = Z.valueOf(mN).pow(mExponent);
      if (t.mod(10) != 0) {
        final String s = t.toString();
        if (s.startsWith(mS)) {
          mS = s;
          return t;
        }
      }
    }
  }
}
