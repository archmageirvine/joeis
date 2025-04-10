package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076607 a(0)=1 and for n&gt;0: a(n) = if gcd(a(n-1),n)&gt;1 then lcm(a(n-1),n) else a(n-1)+n.
 * @author Sean A. Irvine
 */
public class A076607 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = Functions.GCD.l(mA, mN) > 1 ? mA.lcm(mN) : mA.add(mN);
    }
    return mA;
  }
}
