package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001052 <code>a(n) = n*(n-1)*a(n-1)/2 + a(n-2), a(0) = 1, a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A001052 implements Sequence {

  private Z mA = Z.TWO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mA.multiply(mN).multiply(++mN).divide(2).add(mB);
    mB = mA;
    mA = t;
    return t;
  }
}
