package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005258 Apery numbers: <code>a(n) = Sum_{k=0..n} binomial(n,k)^2 * binomial(n+k,k)</code>.
 * @author Sean A. Irvine
 */
public class A005258 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    final Z t = mA.multiply(mN - 1).multiply(mN - 1)
      .add(mB.multiply(n.square().multiply(11).subtract(n.multiply(11)).add(3)))
      .divide(n.square());
    mA = mB;
    mB = t;
    return t;
  }
}

