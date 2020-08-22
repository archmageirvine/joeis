package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014392 Final 2 digits of 8^n.
 * @author Sean A. Irvine
 */
public class A014392 implements Sequence {

  private long mA = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
    } else {
      mA *= 8;
      mA %= 100;
    }
    return Z.valueOf(mA);
  }
}

