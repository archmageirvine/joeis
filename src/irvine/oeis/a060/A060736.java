package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060736 Array of square numbers read by antidiagonals in up direction.
 * @author Sean A. Irvine
 */
public class A060736 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long k) {
    return n < 2 * k - 1 ? Z.valueOf(k).square().add(k - n) : Z.valueOf(n - k).square().add(k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
