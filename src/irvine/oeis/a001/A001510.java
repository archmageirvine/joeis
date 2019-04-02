package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a002.A002715;

/**
 * A001510 From a slowly converging series.
 * @author Sean A. Irvine
 */
public class A001510 extends A002715 {

  private int mState = 0;

  @Override
  public Z next() {
    if (mState < 2) {
      return Z.valueOf(++mState);
    }
    final Z r = super.next();
    super.next();
    return r.add(1);
  }
}
