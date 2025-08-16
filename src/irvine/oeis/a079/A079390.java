package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079390 a(n) = lpf(n) * lpf(n+1) * lpf(n+2), where lpf(n) = A020639(n) is the least prime factor of n.
 * @author Sean A. Irvine
 */
public class A079390 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.LPF.z(++mN).multiply(Functions.LPF.l(mN + 1)).multiply(Functions.LPF.l(mN + 2));
  }
}
