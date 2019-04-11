package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008339 <code>a(1)=1</code>; for <code>n &gt;= 1, a(n+1) =</code> lcm(a(n),n) / gcd(a(n),n).
 * @author Sean A. Irvine
 */
public class A008339 implements Sequence {

  private Z mA = Z.ONE;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.signum() > 0) {
      mA = mA.lcm(mN).divide(mA.gcd(mN));
    }
    return mA;
  }
}


