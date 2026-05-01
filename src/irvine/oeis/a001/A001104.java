package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001104 Numbers k such that k / product of digits of k is a square.
 * @author Sean A. Irvine
 */
public class A001104 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z ds = Functions.DIGIT_PRODUCT.z(mN);
      if (!ds.isZero() && mN.mod(ds).isZero() && mN.divide(ds).isSquare()) {
        return mN;
      }
    }
  }
}

