package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009947 Sequence of nonnegative integers, but insert n/2 after every even number n.
 * @author Sean A. Irvine
 */
public class A009947 extends Sequence0 {

  private long mN = -1;
  private boolean mHalve = false;

  @Override
  public Z next() {
    if (mHalve) {
      mHalve = false;
      return Z.valueOf(mN / 2);
    } else {
      mHalve = (++mN & 1) == 0;
      return Z.valueOf(mN);
    }
  }
}
