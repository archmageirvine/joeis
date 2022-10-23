package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014393 Final 2 digits of 9^n.
 * @author Sean A. Irvine
 */
public class A014393 extends Sequence0 {

  private long mA = 89;

  @Override
  public Z next() {
    mA *= 9;
    mA %= 100;
    return Z.valueOf(mA);
  }
}

