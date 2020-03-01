package irvine.oeis.a331;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A331729 allocated for Frank M Jackson.
 * @author Sean A. Irvine
 */
public class A331729 extends A002858 {

  private Z mLim = Z.ONE;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    mLim = mLim.shiftLeft(1);
    long cnt = 1; // start at 1 from value in previous iteration
    while (super.next().compareTo(mLim) <= 0) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
