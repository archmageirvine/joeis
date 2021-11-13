package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a294.A294525;

/**
 * A052436.
 * @author Sean A. Irvine
 */
public class A052438 extends A294525 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    step();
    if (2 >= mCount.length) {
      return Z.ZERO;
    }
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    return Z.valueOf(mCount[2]);
  }
}
