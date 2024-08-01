package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059339 a(n) is the number of representations of n as a sum x+y, such that bigomega(n) = bigomega(x)+bigomega(y) and 1 &lt;= x &lt;= y &lt; n.
 * @author Sean A. Irvine
 */
public class A059339 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long omega = Functions.BIG_OMEGA.l(++mN);
    long cnt = 0;
    for (long m = 1; 2 * m <= mN; ++m) {
      if (Functions.BIG_OMEGA.l(m) + Functions.BIG_OMEGA.l(mN - m) == omega) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
