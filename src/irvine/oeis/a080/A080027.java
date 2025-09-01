package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080027 Let s(1) = 1; let s(2m) = {s(2m-1),m+1,s(2m-1)}, s(2m+1) = {s(2m),s(2m)}; sequence gives limit of s(k) for large k.
 * @author Sean A. Irvine
 */
public class A080027 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private int mM = 1;
  private int mN = -1;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (++mN >= mS.length()) {
      if (mS.length() == 0) {
        mS.append('1');
      } else {
        mEven = !mEven;
        if (mEven) {
          final String t = mS.toString();
          mS.append(++mM).append(t);
        } else {
          mS.append(mS);
        }
      }
    }
    return Z.valueOf(mS.charAt(mN) - '0');
  }
}
