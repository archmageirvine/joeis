package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a294.A294525;

/**
 * A052439 Number of simple unlabeled n-node graphs with 3 center nodes.
 * @author Sean A. Irvine
 */
public class A052439 extends A294525 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    step();
    if (3 >= mCount.length) {
      return Z.ZERO;
    }
    if (mFirst) {
      mFirst = false;
      return Z.THREE;
    }
    return Z.valueOf(mCount[3]);
  }
}
