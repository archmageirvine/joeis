package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000302;

/**
 * A008565 Digits of powers of 4.
 * @author Sean A. Irvine
 */
public class A008565 extends A000302 {

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
