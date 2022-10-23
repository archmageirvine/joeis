package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001539 a(n) = (4*n+1)*(4*n+3).
 * @author Sean A. Irvine
 */
public class A001539 extends Sequence0 {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(mN).multiply(mN + 2);
  }
}
