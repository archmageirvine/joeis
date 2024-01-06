package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067763 Square array read by antidiagonals of base n numbers written as 122...222 with k 2's (and a suitable interpretation for n=0, 1 or 2).
 * @author Sean A. Irvine
 */
public class A067763 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return n == 1 ? Z.valueOf(2 * m + 1) : Z.valueOf(n).pow(m).multiply(n + 1).subtract(2).divide(n - 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
