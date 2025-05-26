package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383670 Limiting word, as a sequence, obtained by prefixing with 0 the limiting sequence of s(n) defined by s(0) = 0, s(1) = 12, s(n) = the concatenation of s(n - 1) and s(n - 2).
 * @author Sean A. Irvine
 */
public class A383670 extends Sequence1 {

  private String mA = null;
  private String mB = "0";
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mB.length()) {
      if (mA == null) {
        mA = mB;
        mB = "12";
      } else {
        final String t = mA + mB;
        mA = mB;
        mB = t;
      }
      mN = 0;
    }
    return Z.valueOf(mB.charAt(mN) - '0');
  }
}

