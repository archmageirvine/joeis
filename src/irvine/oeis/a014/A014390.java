package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014390 Final 2 digits of 7^n.
 * @author Sean A. Irvine
 */
public class A014390 extends Sequence0 {

  private long mA = 43;

  @Override
  public Z next() {
    mA *= 7;
    mA %= 50;
    return Z.valueOf(mA);
  }
}

