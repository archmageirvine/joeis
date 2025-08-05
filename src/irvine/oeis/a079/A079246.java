package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079246 "Memory" of 2^n: the number of (previous) powers of 2 contained as substrings in 2^n.
 * @author Sean A. Irvine
 */
public class A079246 extends Sequence1 {

  private long mN = 0;

  private Z count(final long n) {
    final String s = Z.ONE.shiftLeft(n).toString();
    long cnt = 0;
    for (long k = 1; k < n; ++k) {
      final Z f = Z.ONE.shiftLeft(k);
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

