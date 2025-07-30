package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079075 "Memory" of fibonacci(n): the number of (previous) Fibonacci numbers contained as substrings in fibonacci(n).
 * @author Sean A. Irvine
 */
public class A079075 extends Sequence1 {

  private long mN = 0;

  private Z count(final long n) {
    final String s = String.valueOf(Functions.FIBONACCI.z(n));
    long cnt = 0;
    for (long k = 1; k < n; ++k) {
      final Z f = Functions.FIBONACCI.z(k);
      if (s.contains(f.toString())) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z next() {
    return count(++mN);
  }
}

