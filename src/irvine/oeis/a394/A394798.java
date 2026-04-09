package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394798 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A394798 extends Sequence2 {

  private long mN = 1;

  static Q average(final long base, long n) {
    long sum = 0;
    long cnt = 0;
    while (n != 0) {
      sum += n % base;
      n /= base;
      ++cnt;
    }
    return new Q(sum, cnt);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long b = 2; b < mN; ++b) {
      final Q an = average(b, mN);
      final Q an2 = average(b, mN * mN);
      if (an.equals(an2)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
