package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062024 a(n) = ((n+1)^n + (n-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A062024 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN++).pow(mN).add(Z.valueOf(mN + 1).pow(mN)).divide2();
  }
}
