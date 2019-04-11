package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014393 Final 2 digits of <code>9^n</code>.
 * @author Sean A. Irvine
 */
public class A014393 implements Sequence {

  private long mA = 89;

  @Override
  public Z next() {
    mA *= 9;
    mA %= 100;
    return Z.valueOf(mA);
  }
}

