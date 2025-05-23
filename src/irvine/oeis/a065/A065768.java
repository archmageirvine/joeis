package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065768 Numbers that are sums of divisors of the odd squares; Intersection of A065764 and A065766, written in ascending order and duplicates removed.
 * @author Sean A. Irvine
 */
public class A065768 extends Sequence1 {

  private static final int HEURISTIC_SORT_SIZE = 100;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeSet<Z> mB = new TreeSet<>();
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      while (mA.size() < HEURISTIC_SORT_SIZE || mB.size() < HEURISTIC_SORT_SIZE || mA.first().compareTo(mB.last()) > 0 || mB.first().compareTo(mA.last()) > 0) {
        mM = mM.add(1);
        final Z s = mM.square();
        final FactorSequence fs = new FactorSequence(Jaguar.factor(s));
        mA.add(fs.sigma());
        fs.add(2, FactorSequence.PRIME);
        mB.add(fs.sigma().divide(3));
      }
      final Z a = mA.first();
      final Z b = mB.first();
      final int c = a.compareTo(b);
      if (c == 0) {
        mA.pollFirst();
        return mB.pollFirst();
      } else if (c < 0) {
        mA.pollFirst();
      } else {
        mB.pollFirst();
      }
    }
  }
}
