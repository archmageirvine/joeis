package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057013 Number of conjugacy classes of subgroups of index n in free group of rank n.
 * @author Sean A. Irvine
 */
public class A057013 extends A057004 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN + 1, mN);
  }
}
