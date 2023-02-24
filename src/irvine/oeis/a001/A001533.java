package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001533 a(n) = (8*n+1)*(8*n+7).
 * @author Sean A. Irvine
 */
public class A001533 extends Sequence0 {

  private long mN = -7;

  @Override
  public Z next() {
    mN += 8;
    return Z.valueOf(mN).multiply(mN + 6);
  }
}
