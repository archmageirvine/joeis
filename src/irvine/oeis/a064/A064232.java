package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064232 a(n) = n^(n+2) mod (n+1)^(n+1).
 * @author Sean A. Irvine
 */
public class A064232 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).modPow(Z.valueOf(mN + 2), Z.valueOf(mN + 1).pow(mN + 1));
  }
}
