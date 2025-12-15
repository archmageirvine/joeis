package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082581 Binomial coefficients C(p, k), 2&lt;=k&lt;=p-2, sorted, with duplicates removed, p being prime.
 * @author Sean A. Irvine
 */
public class A082581 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private long mP = 2;

  @Override
  public Z next() {
    while (mPriority.isEmpty() || Binomial.binomial(mP, 2).compareTo(mPriority.first()) <= 0) {
      for (long k = 2; k <= mP / 2; ++k) {
        mPriority.add(Binomial.binomial(mP, k));
      }
      mP = Functions.NEXT_PRIME.l(mP);
    }
    return mPriority.pollFirst();
  }
}
