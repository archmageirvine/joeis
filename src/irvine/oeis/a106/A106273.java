package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A106273 Discriminant of the polynomial x^n - x^(n-1) -...- x - 1.
 * @author Sean A. Irvine
 */
public class A106273 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    final Z np1 = Z.valueOf(mN + 1);
    final Z t = np1.pow(mN + 1).subtract(n.multiply2().pow(mN).multiply2()).divide(Z.valueOf(mN - 1).square());
    return n.multiply(np1).divide2().isEven() ? t : t.negate();
  }
}

