package irvine.oeis.a031;
// Generated by gen_seq4.pl juxnrev 9 at 2019-07-04 11:13
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031087 Triangle T(n,k): write n in base 9, reverse order of digits.
 * @author Georg Fischer
 */
public class A031087 implements Sequence {
 
  private StringBuilder mS = new StringBuilder();
  private int mPos = 0;
  private Z mN = Z.valueOf(0 - 1);

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = new StringBuilder(mN.toString(9)).reverse();
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos) - '0');
  }
}
