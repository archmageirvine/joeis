package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000420;

/**
 * A008568.
 * @author Sean A. Irvine
 */
public class A008568 extends A000420 {

  private String mA = "";
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.length()) {
      mA = super.next().toString();
      mM = 0;
    }
    return Z.valueOf(mA.charAt(mM) - '0');
  }
}
