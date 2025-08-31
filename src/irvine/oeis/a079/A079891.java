package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079891 a(n) = gcd(n, A079890(n)).
 * @author Sean A. Irvine
 */
public class A079891 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long t = Functions.BIG_OMEGA.l(++mN) + 1;
    long k = mN;
    while (true) {
      if (Functions.BIG_OMEGA.l(++k) == t) {
        return Functions.GCD.z(k, mN);
      }
    }
  }
}

