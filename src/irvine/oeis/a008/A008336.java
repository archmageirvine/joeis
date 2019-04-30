package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008336 <code>a(n+1) = a(n)/n</code> if <code>n|a(n)</code> else <code>a(n)*n, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A008336 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mA.mod(mN) == 0) {
        mA = mA.divide(mN);
      } else {
        mA = mA.multiply(mN);
      }
    }
    return mA;
  }
}


