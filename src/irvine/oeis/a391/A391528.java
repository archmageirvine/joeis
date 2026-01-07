package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391528 Consider the following process: take an integer k&gt;9, sum the digits, repeat the sum deleting the first addendum and adding the previous sum and so on. Sequence lists the minimum integer k such that, after exactly n steps of this process, reaches an integer j which in turn, applying the same process, reaches k again, in a number of steps not necessarily equal to n.
 * @author Sean A. Irvine
 */
public class A391528 extends Sequence1 {

  private long mN = 0;

  private void step(final Z[] s) {
    final Z sum = Functions.SUM.z(s);
    System.arraycopy(s, 1, s, 0, s.length - 1);
    s[s.length - 1] = sum;
  }

  private Z[] start(final Z k) {
    final Z[] s = new Z[Functions.DIGIT_LENGTH.i(k)];
    Z t = k;
    for (int j = s.length - 1; j >= 0; --j) {
      final Z[] qr = t.divideAndRemainder(Z.TEN);
      s[j] = qr[1];
      t = qr[0];
    }
    return s;
  }

  private boolean is(final long k, final long n) {
    // Run k for n steps
    final Z[] s = start(Z.valueOf(k));
    for (long j = 1; j < n; ++j) {
      step(s);
    }
    // See if running the result leads back to k
    final Z[] t = start(Functions.SUM.z(s));
    if (t.length < 2) {
      return false;
    }
    while (true) {
      final Z sum = Functions.SUM.z(t);
      final int c = sum.compareTo(k);
      if (c == 0) {
        return true;
      }
      if (c > 0) {
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
