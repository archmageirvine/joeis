package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394770 Smallest base b for which the average of the digits of n base b divided by b is the largest for any base b &lt;= n.
 * @author Sean A. Irvine
 */
public class A394770 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Q max = Q.ZERO;
    long bestB = 0;
    for (long b = 2; b <= mN; ++b) {
      final Q a = A394798.average(b, mN).divide(b);
      if (a.compareTo(max) > 0) {
        max = a;
        bestB = b;
      }
    }
    return Z.valueOf(bestB);
  }
}
