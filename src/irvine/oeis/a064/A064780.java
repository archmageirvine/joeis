package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064780 Number of times n occurs in A000195.
 * @author Sean A. Irvine
 */
public class A064780 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TWO : CR.valueOf(mN + 1).exp().floor().subtract(CR.valueOf(mN).exp().floor());
  }
}
