package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001538 a(n) = (12*n+1)*(12*n+11).
 * @author Sean A. Irvine
 */
public class A001538 extends Sequence0 {

  private long mN = -11;

  @Override
  public Z next() {
    mN += 12;
    return Z.valueOf(mN).multiply(mN + 10);
  }
}
