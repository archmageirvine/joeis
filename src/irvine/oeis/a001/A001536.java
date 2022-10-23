package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001536 a(n) = (11n+1)*(11n+10).
 * @author Sean A. Irvine
 */
public class A001536 extends Sequence0 {

  private long mN = -10;

  @Override
  public Z next() {
    mN += 11;
    return Z.valueOf(mN).multiply(mN + 9);
  }
}
