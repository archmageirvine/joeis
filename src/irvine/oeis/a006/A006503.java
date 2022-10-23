package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006503 a(n) = n*(n+1)*(n+8)/6.
 * @author Sean A. Irvine
 */
public class A006503 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN + 1).multiply(mN + 8).divide(6);
  }
}

