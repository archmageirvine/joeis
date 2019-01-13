package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A003150.
 * @author Sean A. Irvine
 */
public class A003150 implements Sequence {

  private Z mDen = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z f = Fibonacci.fibonacci(mN);
    mDen = mDen.multiply(f);
    Z num = Z.ONE;
    for (int k = mN + 2; k <= 2 * mN; ++k) {
      num = num.multiply(Fibonacci.fibonacci(k));
    }
    return num.divide(mDen);
  }
}
