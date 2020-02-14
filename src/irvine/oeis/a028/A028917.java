package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028917 <code>a(n) = (3*n+1)! / (24*n)</code>.
 * @author Sean A. Irvine
 */
public class A028917 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3 * mN).multiply(3 * mN + 4).multiply(3 * mN + 2);
    }
    return mA;
  }
}
