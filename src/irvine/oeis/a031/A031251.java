package irvine.oeis.a031;
// Generated by gen_seq4.pl juxncomp 5 at 2019-06-29 14:09
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031251 Write n in base 5, then complement each digit (d -&gt; 4-d) and juxtapose.
 * @author Georg Fischer
 */
public class A031251 extends Sequence1 {
 
  private String mS = "";
  private int mPos = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = mN.toString(5);
      mPos = 0;
    }
    return Z.valueOf(5 - 1 - (mS.charAt(mPos) - '0'));
  }
}
