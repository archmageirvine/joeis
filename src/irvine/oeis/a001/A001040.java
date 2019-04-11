package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001040 <code>a(n+1) = n*a(n) + a(n-1)</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A001040 implements Sequence {

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
