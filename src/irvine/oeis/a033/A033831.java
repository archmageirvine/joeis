package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033831 Number of numbers d dividing n such that d <code>&gt;= 3</code> and <code>1 &lt;= n/d &lt;= d-2</code>.
 * @author Sean A. Irvine
 */
public class A033831 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if (d >= 3 && mN / d <= d - 2) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
