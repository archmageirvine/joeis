package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A008564 Digits of powers of 3.
 * @author Sean A. Irvine
 */
public class A008564 extends A000244 {

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
