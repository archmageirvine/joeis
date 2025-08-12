package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079390 spf(n) * spf(n+1) * spf(n+2), where spf=A020639 (smallest prime factor).
 * @author Sean A. Irvine
 */
public class A079390 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.LPF.z(++mN).multiply(Functions.LPF.l(mN + 1)).multiply(Functions.LPF.l(mN + 2));
  }
}
