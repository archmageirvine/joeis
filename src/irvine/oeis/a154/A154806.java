package irvine.oeis.a154;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A154806 Numbers such that every run length in base 2 is 4.
 * @author Sean A. Irvine
 */
public class A154806 extends Sequence1 {

  private String mS = "";

  @Override
  public Z next() {
    if (mS.isEmpty() || mS.charAt(mS.length() - 1) == '0') {
      mS = mS + "1111";
    } else {
      mS = mS + "0000";
    }
    return new Z(mS, 2);
  }
}

