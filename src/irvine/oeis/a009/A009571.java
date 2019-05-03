package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009571 Least m such that if <code>a/b &lt; c/d</code> are Farey fractions of order n then there exists k such that <code>a/b &lt; k/m &lt; c/d, k/m</code> reduced.
 * @author Sean A. Irvine
 */
public class A009571 implements Sequence {

  //private long mN = 0;

  @Override
  public Z next() {
    throw new UnsupportedOperationException();
//    ++mN;
//    // Generate consecutive Farey fractions a/b, c/d of order n
//    // Initially a/b = 0/1, c/d = 1/n
//    long a = 0;
//    long b = 1;
//    long c = 1;
//    long d = mN;
//    long min = Long.MAX_VALUE;
//    do {
//      // Compute the number that will first appear between a/b, c/d
//      final long u = a + c;
//      final long v = b + d;
//      final long gcd = LongUtils.gcd(u, v);
//      final long m = v / gcd;
//      if (m < min) {
//        min = m;
//      }
//      // Compute next order n Farey fraction p/q from a/b, c/d
//      final long f = (mN + b) /d;
//      final long p = f * c - a;
//      final long q = f * d - b;
//      System.out.println(new Q(a, b) + " " + new Q(c, d) + " " + new Q(p, q) + " :: " + new Q(u, v));
//      // Move along
//      a = c;
//      b = d;
//      c = p;
//      d = q;
//    } while (2 * c < d);
//    return Z.valueOf(min);
  }
}
