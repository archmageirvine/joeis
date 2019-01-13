package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000114;

/**
 * A001766.
 * @author Sean A. Irvine
 */
public class A001766 extends A000114 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    } else {
      return super.next().multiply(mN);
    }
  }
}
