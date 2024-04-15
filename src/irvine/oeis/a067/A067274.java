package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a010.A010052;

/**
 * A067274 Number of ordered integer pairs (b,c), with -n&lt;=b&lt;=n, -n&lt;=c&lt;=n, such that both roots of x^2+bx+c=0 are integers.
 * @author Sean A. Irvine
 */
public class A067274 extends A010052 {

  private Z mA = Z.FOUR;
  private long mN = -1;

  @Override
  public Z next() {
    final Z c = super.next();
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      mA = mA.add(Functions.SIGMA0.z(mN).add(1).multiply2().add(c));
    }
    return mA;
  }
}
