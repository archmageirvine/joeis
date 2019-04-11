package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010844 <code>a(n) = 2*n*a(n-1) + 1</code> with <code>a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A010844 implements Sequence {

  private int mN = -2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mA = mA.multiply(mN).add(1);
    }
    return mA;
  }
}
