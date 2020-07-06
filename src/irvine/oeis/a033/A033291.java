package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a192.A192735;

/**
 * A033291 A Connell-like sequence: take the first multiple of 1, the next 2 multiples of 2, the next 3 multiples of 3, etc.
 * @author Sean A. Irvine
 */
public class A033291 extends A192735 {

  private long mN = 0;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN++;
      mT = super.next();
    } else {
      mT = mT.add(mN);
    }
    return mT;
  }
}

