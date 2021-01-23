package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030134 a(n)^2 has last digit equal to the sum of the other digits.
 * @author Sean A. Irvine
 */
public class A030134 implements Sequence {

  private Z mN = Z.valueOf(26);

  private boolean isOk(final Z n, final long r) {
    if (r == 0) {
      return false;
    }
    final int[] counts = ZUtils.digitCounts(n);
    long sum = 0;
    for (int k = 1; k < counts.length; ++k) {
      sum += k * counts[k];
      if (sum > r) {
        return false;
      }
    }
    return sum == r;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      final Z[] qr = s.divideAndRemainder(Z.TEN);
      final long r = qr[1].longValue();
      if (isOk(qr[0], r)) {
        return mN;
      }
    }
  }
}
