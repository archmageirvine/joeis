package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003137.
 * @author Sean A. Irvine
 */
public class A003137 implements Sequence {

  private String mS = "";
  private int mPos = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = mN.toString(3);
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos++) - '0');
  }
}

