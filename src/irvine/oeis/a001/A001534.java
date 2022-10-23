package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001534 a(n) = (9n+1)*(9n+8).
 * @author Sean A. Irvine
 */
public class A001534 extends Sequence0 {

  private long mN = -8;

  @Override
  public Z next() {
    mN += 9;
    return Z.valueOf(mN).multiply(mN + 7);
  }
}
