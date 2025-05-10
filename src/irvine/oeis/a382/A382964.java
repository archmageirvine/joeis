package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382964 Number of k &lt;= n such that rad(k) divides n and g * k &gt; n where g is the largest prime factor of n and rad = A007947.
 * @author Sean A. Irvine
 */
public class A382964 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long gpf = Functions.GPF.l(++mN);
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      final long r = Functions.RAD.l(k);
      if (mN % r == 0 && k * gpf > mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

