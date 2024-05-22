package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063731 Numbers k such that Sum_{j=1..k} sigma(j) divides Product_{j=1..k} sigma(j).
 * @author Sean A. Irvine
 */
public class A063731 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA1.z(++mN);
      mSum = mSum.add(sigma);
      mProd = mProd.multiply(sigma);
      if (mProd.mod(mSum).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
