package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a078.A078972;

/**
 * A082785 Number of ways n can be written as the sum of a brilliant number and a prime.
 * @author Sean A. Irvine
 */
public class A082785 extends Sequence1 {

  private final DirectSequence mBrilliant = DirectSequence.create(new A078972());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (int k = 0; mBrilliant.a(k).compareTo(mN) < 0; ++k) {
      if (Predicates.PRIME.is(mN - mBrilliant.a(k).longValue())) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
