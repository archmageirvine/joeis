package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000315;

/**
 * A057997 Number of labeled loops (quasigroups with an identity element).
 * @author Sean A. Irvine
 */
public class A057997 extends A000315 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
