package irvine.oeis.a379;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A379920 allocated for Xavier Roulleau.
 * @author Sean A. Irvine
 */
public class A379920 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mA = 2;
  private long mB = 3;

  @Override
  public Z next() {
    if (mUsed.size() < 3) {
      final long v = mUsed.size() + 1;
      mUsed.add(v);
      return Z.valueOf(v);
    }
    long k = 3;
    while (true) {
      ++k;
      if (Functions.GCD.l(mA, k) != 1 && Functions.GCD.l(mB, k) == 1 && Predicates.SQUARE_FREE.is(k) && mUsed.add(k)) {
        mA = mB;
        mB = k;
        return Z.valueOf(k);
      }
    }
  }
}
