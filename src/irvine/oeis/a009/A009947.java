package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009947 Sequence of nonnegative integers, but insert <code>n/2</code> after every even number n.
 * @author Sean A. Irvine
 */
public class A009947 implements Sequence {

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
