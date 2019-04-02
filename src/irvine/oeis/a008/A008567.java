package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000400;

/**
 * A008567 Digits of powers of 6.
 * @author Sean A. Irvine
 */
public class A008567 extends A000400 {

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
