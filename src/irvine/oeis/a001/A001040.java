package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001040 a(n+1) = n*a(n) + a(n-1) with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A001040 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    final Z t = mA.multiply(++mN).add(mB);
    mB = mA;
    mA = t;
    return t;
  }
}
