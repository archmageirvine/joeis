package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162536 a(n) is the smallest positive multiple k of n such that every length of the runs of 0's and 1's in the binary representation of k divides n.
 * @author Sean A. Irvine
 */
public class A162536 extends Sequence1 {

  private long mN = 0;

  static boolean test(final Z v, final long n) {
    final String s = v.toString(2);
    char c = s.charAt(0);
    long cnt = 1;
    for (int k = 1; k < s.length(); ++k) {
      final char d = s.charAt(k);
      if (d == c) {
        ++cnt;
      } else {
        if (n % cnt != 0) {
          return false;
        }
        c = d;
        cnt = 1;
      }
    }
    return n % cnt == 0;
  }

  @Override
  public Z next() {
    ++mN;
    Z v = Z.valueOf(mN);
    while (true) {
      if (test(v, mN)) {
        return v;
      }
      v = v.add(mN);
    }
  }
}

