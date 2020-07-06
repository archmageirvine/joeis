package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033271 Number of odd nonprimes <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A033271 extends A033270 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 2).subtract(super.next());
  }
}

