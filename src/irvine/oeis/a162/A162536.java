package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162536 <code>a(n) =</code> the smallest positive multiple of n where every length of the runs of <code>0</code>'s and <code>1</code>'s in the binary representation of <code>a(n)</code> divides n.
 * @author Sean A. Irvine
 */
public class A162536 implements Sequence {

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

