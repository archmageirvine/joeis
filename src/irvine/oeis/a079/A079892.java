package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079892 Least number &gt; n having one more distinct prime factor than n.
 * @author Sean A. Irvine
 */
public class A079892 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int t = Functions.OMEGA.i(++mN) + 1;
    long k = mN;
    while (true) {
      if (Functions.OMEGA.i(++k) == t) {
        return Z.valueOf(k);
      }
    }
  }
}

