package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a294.A294525;

/**
 * A052441 Number of simple unlabeled n-node graphs with 5 center nodes.
 * @author Sean A. Irvine
 */
public class A052441 extends A294525 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    step();
    if (5 >= mCount.length) {
      return Z.ZERO;
    }
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(18);
    }
    return Z.valueOf(mCount[5]);
  }
}
