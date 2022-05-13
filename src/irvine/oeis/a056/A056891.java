package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a006.A006533;

/**
 * A056888.
 * @author Sean A. Irvine
 */
public class A056891 extends A006533 {

  @Override
  public Z next() {
    return super.next().subtract(mN & 1).divide(mN);
  }
}
