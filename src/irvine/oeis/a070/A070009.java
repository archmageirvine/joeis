package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A069970.
 * @author Sean A. Irvine
 */
public class A070009 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final FactorSequence fs = Jaguar.factor(++mM);
      final Z[] t = fs.sopf().divideAndRemainder(fs.omega());
      if (t[1].isZero() && Predicates.POWER_OF_TWO.is(t[0])) {
        final int v = (int) t[0].makeOdd().auxiliary();
        if (mFirsts.get(v) == 0) {
          mFirsts.set(v, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
