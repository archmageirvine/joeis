package irvine.oeis.a070;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A070078 If n is squarefree then Min{k | A070077(k) = n} else 0.
 * @author Sean A. Irvine
 */
public class A070078 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Sequence mS = new A070077();
  private long mM = 0;
  private int mN = 0;

  @Override
  public Z next() {
    if (Predicates.SQUARE_FREE.is(++mN)) {
      while (mFirsts.get(mN) == 0) {
        ++mM;
        final int t = mS.next().intValueExact();
        if (mFirsts.get(t) == 0) {
          mFirsts.set(t, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
