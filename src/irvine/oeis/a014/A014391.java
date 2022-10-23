package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014391 Final digit of 8^n.
 * @author Sean A. Irvine
 */
public class A014391 extends Sequence0 {

  private long mA = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
    } else {
      mA *= 8;
      mA %= 10;
    }
    return Z.valueOf(mA);
  }
}

