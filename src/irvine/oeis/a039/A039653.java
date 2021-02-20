package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A039653.
 * @author Sean A. Irvine
 */
public class A039653 extends A000203 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().subtract(1);
  }
}
