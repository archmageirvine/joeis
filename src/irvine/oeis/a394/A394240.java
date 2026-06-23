package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A394240 Number of regions formed by extending the faces of a regular n-gonal pyramid.
 * @author Sean A. Irvine
 */
public class A394240 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(3).subtract((mN & 1) == 0 ? 2 : 1).multiply(mN).add(6).divide2();
  }
}
