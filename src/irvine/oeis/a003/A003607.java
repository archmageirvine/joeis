package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003607 Location of 0's when natural numbers are listed in binary.
 * @author Sean A. Irvine
 */
public class A003607 extends Sequence0 {

  private String mS = "";
  private long mN = -1;
  private int mM = 0;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      if (mM >= mS.length()) {
        mS = Long.toBinaryString(++mN);
        mM = 0;
      }
      mC = mC.add(1);
      if (mS.charAt(mM++) == '0') {
        return mC;
      }
    }
  }
}
