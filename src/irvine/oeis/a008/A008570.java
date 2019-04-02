package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a001.A001019;

/**
 * A008570 Digits of powers of 9.
 * @author Sean A. Irvine
 */
public class A008570 extends A001019 {

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
