package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076475 Primes in the numerator of the slowest decreasing sequence of unit fractions whose partial sums have a prime numerator.
 * @author Sean A. Irvine
 */
public class A076475 extends Sequence2 {

  private Q mA = Q.ONE;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      final Q t = mA.add(new Q(1, ++mM));
      if (t.num().isProbablePrime()) {
        mA = t;
        return mA.num();
      }
    }
  }
}
