package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079890 Least number &gt; n having one more prime factor than n, not necessarily distinct.
 * @author Sean A. Irvine
 */
public class A079890 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long t = Functions.BIG_OMEGA.l(++mN) + 1;
    long k = mN;
    while (true) {
      if (Functions.BIG_OMEGA.l(++k) == t) {
        return Z.valueOf(k);
      }
    }
  }
}

