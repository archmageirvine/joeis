package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002702.
 * @author Sean A. Irvine
 */
public class A002702 extends A002701 {

  @Override
  public Z next() {
    return computeNext().den();
  }
}
