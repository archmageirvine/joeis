package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395547 Largest prime of the form x*y + y*z + z*x for integers 0 &lt;= x &lt;= y &lt;= z &lt;= n.
 * @author Sean A. Irvine
 */
public class A395547 extends Sequence1 {

  private long mN = 0;
  private Z mMaxPrime = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    for (long y = 0; y <= mN; ++y) {
      final Z s1 = Z.valueOf(y * mN);
      for (long x = 0; x <= y; ++x) {
        final Z s = s1.add(x * mN).add(x * y);
        if (s.compareTo(mMaxPrime) > 0 && s.isProbablePrime()) {
          mMaxPrime = s;
        }
      }
    }
    return mMaxPrime;
  }
}
