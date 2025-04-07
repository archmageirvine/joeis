package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076474 Denominators of the slowest decreasing sequence of unit fractions whose partial sums have a prime numerator.
 * @author Sean A. Irvine
 */
public class A076474 extends Sequence1 {

  private Q mSum = null;
  private long mM = 1;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Q.ONE;
      return Z.ONE;
    }
    while (true) {
      final Q t = mSum.add(new Q(1, ++mM));
      if (t.num().isProbablePrime()) {
        mSum = t;
        return Z.valueOf(mM);
      }
    }
  }
}
