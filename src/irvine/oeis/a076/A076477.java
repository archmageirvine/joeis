package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076477 Primes in the numerator of partial sums of A076476.
 * @author Sean A. Irvine
 */
public class A076477 extends Sequence2 {

  private Q mSum = Q.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.GCD.l(++k, mN) == 1) {
        final Q t = mSum.add(new Q(k, mN));
        if (t.num().isProbablePrime()) {
          mSum = t;
          return mSum.num();
        }
      }
    }
  }
}
