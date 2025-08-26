package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000396;

/**
 * A079718 Perfect numbers read digit-by-digit.
 * @author Sean A. Irvine
 */
public class A079718 extends A000396 {

  private String mS = "";
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mS.length()) {
      mS = super.next().toString();
      mM = 0;
    }
    return Z.valueOf(mS.charAt(mM) - '0');
  }
}

