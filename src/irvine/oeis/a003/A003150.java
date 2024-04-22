package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003150 Fibonomial Catalan numbers.
 * @author Sean A. Irvine
 */
public class A003150 extends Sequence0 {

  private Z mDen = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z f = Functions.FIBONACCI.z((long) mN);
    mDen = mDen.multiply(f);
    Z num = Z.ONE;
    for (int k = mN + 2; k <= 2 * mN; ++k) {
      num = num.multiply(Functions.FIBONACCI.z((long) k));
    }
    return num.divide(mDen);
  }
}
