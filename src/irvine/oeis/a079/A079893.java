package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079893 a(n) = gcd(n, A079892(n)), where A079892(n) is the least number &gt; n having one more distinct prime factor than n.
 * @author Sean A. Irvine
 */
public class A079893 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int t = Functions.OMEGA.i(++mN) + 1;
    long k = mN;
    while (true) {
      if (Functions.OMEGA.i(++k) == t) {
        return Functions.GCD.z(k, mN);
      }
    }
  }
}

