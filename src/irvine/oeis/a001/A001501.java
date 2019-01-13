package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001501.
 * @author Sean A. Irvine
 */
public class A001501 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private Z mSixPower = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mSixPower = mSixPower.multiply(6);
    }
    Z sum = Z.ZERO;
    final Z nfs = mF.factorial(mN).square();
    for (int k = 0; k <= mN; ++k) {
      Z t = Z.ZERO;
      Z powerThree = Z.ONE;
      final int q = 3 * mN - 3 * k;
      for (int j = 0; j <= mN - k; ++j) {
        final Z d = mF.factorial(mN - k - j).square();
        final Z x = d.multiply(Z.SIX.pow(mN - k - j)).multiply(mF.factorial(j));
        final Z v = powerThree.multiply(mF.factorial(q - 2 * j)).multiply(nfs).divide(x);
        t = t.add(v);
        powerThree = powerThree.multiply(-3);
      }
      sum = sum.add(t.shiftLeft(k).divide(mF.factorial(k)));
    }
    return sum.divide(mSixPower);
  }
}
