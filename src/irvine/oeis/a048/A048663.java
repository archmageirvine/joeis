package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001931;

/**
 * A048663 Number of rooted polycubes with n cells, with no symmetries removed.
 * @author Sean A. Irvine
 */
public class A048663 extends A001931 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
