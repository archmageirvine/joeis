package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075373 extends Sequence1 {

  private final Set<Long> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.NINE;
      mUsed.add(3L);
      return mB;
    }
    final Z t = mA.add(mB);
    long k = 0;
    while (true) {
      final Z sq = Z.valueOf(++k).square();
      if (Predicates.SQUARE.is(t.add(sq)) && mUsed.add(k)) {
        mA = mB;
        mB = sq;
        return sq;
      }
    }
  }
}
