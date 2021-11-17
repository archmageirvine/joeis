package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a294.A294525;

/**
 * A052437 Number of simple unlabeled n-node graphs with 1 center node.
 * @author Sean A. Irvine
 */
public class A052437 extends A294525 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mCount[1]);
  }
}
