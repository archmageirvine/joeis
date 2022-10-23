package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001191 Digits of positive squares.
 * @author Sean A. Irvine
 */
public class A001191 extends Sequence1 {

  private Z mN = Z.ZERO;
  private String mToDo = "";
  private int mPos = 0;

  @Override
  public Z next() {
    if (mPos >= mToDo.length()) {
      mN = mN.add(1);
      mToDo = mN.square().toString();
      mPos = 0;
    }
    return Z.valueOf(mToDo.charAt(mPos++) - '0');
  }
}
