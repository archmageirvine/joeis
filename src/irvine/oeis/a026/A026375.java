package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026375 a(n) = Sum_{k=0..n} binomial(n,k)*binomial(2*k,k).
 * @author Sean A. Irvine
 */
public class A026375 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.THREE;
    }
    final Z t = mB.multiply(2 * mN - 1).multiply(3).subtract(mA.multiply(mN - 1).multiply(5)).divide(mN);
    mA = mB;
    mB = t;
    return t;
  }
}
