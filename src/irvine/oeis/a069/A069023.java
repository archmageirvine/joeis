package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069003.
 * @author Sean A. Irvine
 */
public class A069023 extends Sequence1 {

  private long mCount = 0;
  private long mN = 0;

  private boolean isStillDedicated(final Set<Long> dedicatedSet, final long e) {
    for (final long d : dedicatedSet) {
      if (mN % (d * e) != 0) {
        return false;
      }
    }
    return true;
  }

  private void search(final List<Long> divisors, final int pos, final Set<Long> dedicatedSet) {
    if (dedicatedSet.size() >= 2) {
      ++mCount;
    }
    for (int k = pos; k < divisors.size(); ++k) {
      final long e = divisors.get(k);
      if (isStillDedicated(dedicatedSet, e)) {
        dedicatedSet.add(e);
        search(divisors, k + 1, dedicatedSet);
        dedicatedSet.remove(e);
      }
    }
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final List<Long> properDivisors = new ArrayList<>();
    for (final Z dd : fs.divisors()) {
      final long d = dd.longValue();
      if (d != 1 && d != mN) {
        properDivisors.add(d);
      }
    }
    mCount = 0;
    search(properDivisors, 0, new HashSet<>());
    return Z.valueOf(mCount);
  }
}

