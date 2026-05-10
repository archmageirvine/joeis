package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395568 Largest prime of the form x*y + x*z + x*t + y*z + y*t + z*t for integers 0 &lt;= x &lt;= y &lt;= z &lt;= t &lt;= n.
 * @author Sean A. Irvine
 */
public class A395568 extends Sequence1 {

  private long mN = 0;
  private Z mMaxPrime = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    for (long z = 0; z <= mN; ++z) {
      final Z s0 = Z.valueOf(z * mN);
      for (long y = 0; y <= z; ++y) {
        final Z s1 = s0.add(y * mN).add(y * z);
        for (long x = 0; x <= y; ++x) {
          final Z s = s1.add(x * mN).add(x * z).add(x * y);
          if (s.compareTo(mMaxPrime) > 0 && s.isProbablePrime()) {
            mMaxPrime = s;
          }
        }
      }
    }
    return mMaxPrime;
  }
}
