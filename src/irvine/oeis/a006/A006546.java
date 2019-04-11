package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006546 Number of elements <code>(a b,</code> c d) in SL(2,Z) with trace n and <code>0 &lt;= a &lt;= {b,</code> c} <code>&lt;=</code> d.
 * @author Sean A. Irvine
 */
public class A006546 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 0; a <= mN / 2; ++a) {
      final long d = mN - a;
      assert d >= a;
      for (long b = a; b <= d; ++b) {
        for (long c = a; c <= d; ++c) {
          // SL(2,Z) requires det == 1
          if (a * d - b * c == 1) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
