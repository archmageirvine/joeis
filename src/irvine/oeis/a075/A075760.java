package irvine.oeis.a075;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075760 Nontrivial binomial coefficients which are perfect powers (A001597).
 * @author Sean A. Irvine
 */
public class A075760 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z b2 = Binomial.binomial(mN, 2);
      if (!mA.isEmpty() && mA.first().compareTo(b2) < 0) {
        break;
      }
      if (Predicates.POWER.is(b2)) {
        mA.add(b2);
      }
      final Z b3 = Binomial.binomial(mN, 3);
      if (Predicates.POWER.is(b3)) {
        mA.add(b3);
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
