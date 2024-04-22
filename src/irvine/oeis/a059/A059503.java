package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059503 The array in A059502 read by antidiagonals in 'up' direction.
 * @author Sean A. Irvine
 */
public class A059503 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int k) {
    return Functions.FIBONACCI.z(2L * k).multiply(3 - k).add(Functions.FIBONACCI.z(2L * k - 1).multiply(5L * n + 3L * k)).divide(5);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
