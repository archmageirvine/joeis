package irvine.oeis.a154;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A154808 Numbers such that every run length in base 2 is 5.
 * @author Sean A. Irvine
 */
public class A154808 extends Sequence1 {

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

