package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001168;

/**
 * A048664 Number of rooted 2-dimensional polyominoes with n square cells, with no symmetries removed.
 * @author Sean A. Irvine
 */
public class A048664 extends A001168 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
