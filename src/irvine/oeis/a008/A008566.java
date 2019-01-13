package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000351;

/**
 * A008566.
 * @author Sean A. Irvine
 */
public class A008566 extends A000351 {

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
