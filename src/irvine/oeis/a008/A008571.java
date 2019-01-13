package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a001.A001020;

/**
 * A008571.
 * @author Sean A. Irvine
 */
public class A008571 extends A001020 {

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
