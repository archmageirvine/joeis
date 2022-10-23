package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005259 Apery (Ap\u00e9ry) numbers: Sum_{k=0..n} (binomial(n,k)*binomial(n+k,k))^2.
 * @author Sean A. Irvine
 */
public class A005259 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    final Z t = mB.multiply(n.pow(3).multiply(34)
                            .subtract(n.square().multiply(51))
                            .add(n.multiply(27)).subtract(5))
      .subtract(mA.multiply(mN - 1).multiply(mN - 1).multiply(mN - 1))
      .divide(n.pow(3));
    mA = mB;
    mB = t;
    return t;
  }
}

