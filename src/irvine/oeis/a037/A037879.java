package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037879 a(n) = (1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*2^i} is the base-2 representation of n and {e(i)} are digits {d(i)} in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A037879 extends Sequence1 {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    long m = mN;
    long l = Functions.DIGIT_SORT_DESCENDING.l(base(), mN);
    while (m != 0) {
      cnt += Math.abs(m % base() - l % base());
      m /= base();
      l /= base();
    }
    return Z.valueOf(cnt / 2);
  }
}
