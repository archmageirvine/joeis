package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006331 a(n) = n*(n+1)*(2*n+1)/3.
 * @author Sean A. Irvine
 */
public class A006331 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2 * mN + 1).multiply(mN).multiply(mN + 1).divide(3);
  }
}

