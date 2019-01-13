package irvine.oeis.a154;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A154808.
 * @author Sean A. Irvine
 */
public class A154808 implements Sequence {

  private String mS = "";

  @Override
  public Z next() {
    if (mS.isEmpty() || mS.charAt(mS.length() - 1) == '0') {
      mS = mS + "11111";
    } else {
      mS = mS + "00000";
    }
    return new Z(mS, 2);
  }
}

