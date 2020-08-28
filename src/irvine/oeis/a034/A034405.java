package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034405 Let f(x)=(Pi-2*arctan(1/(sqrt(x)*sqrt(x+2))))/(2*sqrt(x)*sqrt(x+2)), take (-1)^n*(n-th derivative from right at x=0) and multiply by A001147(n+1).
 * @author Sean A. Irvine
 */
public class A034405 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private long mN = -3;

  @Override
  public Z next() {
    if (++mN >= 0) {
      final Z t = mB.multiply(mN + 2).multiply(3 * mN + 5)
        .subtract(mA.multiply(2 * mN + 3).multiply(mN + 1).multiply(mN + 1).multiply(mN + 2));
      mA = mB;
      mB = t;
    } else if (mN == -2) {
      return Z.ONE;
    }
    return mB;
  }
}
