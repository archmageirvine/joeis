package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001501 Number of n X n 0-1 matrices with all column and row sums equal to 3.
 * @author Sean A. Irvine
 */
public class A001501 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Z mSixPower = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mSixPower = mSixPower.multiply(6);
    }
    Z sum = Z.ZERO;
    final Z nfs = Functions.FACTORIAL.z(mN).square();
    for (int k = 0; k <= mN; ++k) {
      Z t = Z.ZERO;
      Z powerThree = Z.ONE;
      final int q = 3 * mN - 3 * k;
      for (int j = 0; j <= mN - k; ++j) {
        final Z d = Functions.FACTORIAL.z(mN - k - j).square();
        final Z x = d.multiply(Z.SIX.pow(mN - k - j)).multiply(Functions.FACTORIAL.z(j));
        final Z v = powerThree.multiply(Functions.FACTORIAL.z(q - 2 * j)).multiply(nfs).divide(x);
        t = t.add(v);
        powerThree = powerThree.multiply(-3);
      }
      sum = sum.add(t.shiftLeft(k).divide(Functions.FACTORIAL.z(k)));
    }
    return sum.divide(mSixPower);
  }
}
