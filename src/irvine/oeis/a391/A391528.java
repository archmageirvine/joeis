package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391528.
 * @author Sean A. Irvine
 */
public class A391528 extends Sequence1 {

  private long mN = 0;

  private void step(final long[] s) {
    final long sum = Functions.SUM.l(s);
    System.arraycopy(s, 1, s, 0, s.length - 1);
    s[s.length - 1] = sum;
  }

  private long[] start(final long k) {
    final long[] s = new long[Functions.DIGIT_LENGTH.i(k)];
    long t = k;
    for (int j = s.length - 1; t != 0; --j, t /= 10) {
      s[j] = t % 10;
    }
    return s;
  }

  private boolean is(final long k, final long n) {
    // Run k for n steps
    final long[] s = start(k);
    for (long j = 1; j < n; ++j) {
      step(s);
    }
    // See if running the result leads back to k
    final long[] t = start(Functions.SUM.l(s));
    if (t.length < 2) {
      return false;
    }
    while (true) {
      final long sum = Functions.SUM.l(t);
      if (sum == k) {
        return true;
      }
      if (sum > k) {
        return false;
      }
      step(t);
    }
  }

  @Override
  public Z next() {
    ++mN;
    long k = 9;
    while (true) {
      if (is(++k, mN)) {
        return Z.valueOf(k);
      }
    }
  }
}
