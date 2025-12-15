package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082583 Quotients C(p, k)/p sorted, with duplicates removed, p being prime.
 * @author Sean A. Irvine
 */
public class A082583 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private long mP = 2;
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    while (mPriority.isEmpty() || Binomial.binomial(mP, 2).divide(mP).compareTo(mPriority.first()) <= 0) {
      for (long k = 2; k <= mP / 2; ++k) {
        final Z[] qr = Binomial.binomial(mP, k).divideAndRemainder(mP);
        if (qr[1].isZero()) {
          mPriority.add(qr[0]);
        }
      }
      mP = Functions.NEXT_PRIME.l(mP);
    }
    return mPriority.pollFirst();
  }
}
