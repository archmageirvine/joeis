package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.oeis.a003.A003636;

/**
 * A006371 Number of reduced binary quadratic forms of discriminant -n.
 * @author Sean A. Irvine
 */
public class A006371 extends Sequence3 {

  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      --mN;
      if ((mN & 3) <= 1) {
        return Z.valueOf(A003636.forms(mN).size());
      }
    }
  }
}
