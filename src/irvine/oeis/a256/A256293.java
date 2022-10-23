package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A256293 Apply the transformation 0 -&gt; 1 -&gt; 2 -&gt; 0 to the digits of n written in base 3, then convert back to base 10.
 * @author Georg Fischer
 */
public class A256293 extends Sequence0 {

  private int mN;
  private final int mBase;
  private final StringBuilder mReplacements;
  private final boolean mBack10;

  /** Construct the sequence. */
  public A256293() {
    this(3, true);
  }

  /**
   * Generic constructor with parameters
   * @param base number base
   * @param back10 whether to convert back to base 10
   */
  public A256293(final int base, final boolean back10) {
    mN = -1;
    mBase = base;
    mBack10 = back10;
    mReplacements = new StringBuilder();
    for (int i = 1; i < base; ++i) {
      mReplacements.append(i);
    }
    mReplacements.append('0');
  }

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder(Integer.toString(++mN, mBase));
    for (int pos = sb.length() - 1; pos >= 0; --pos) {
      sb.setCharAt(pos, mReplacements.charAt(sb.charAt(pos) - '0'));
    }
    return mBack10 ? new Z(sb.toString(), mBase) : new Z(sb.toString(), 10);
  }
}
