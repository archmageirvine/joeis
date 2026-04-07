package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394543 Numbers k that reach a power of 2 in zero or more iterations of k -&gt; 2k - (sum of proper factors of 2k).
 * @author Sean A. Irvine
 */
public class A394543 extends Sequence1 {

  private long mN = 0;

  private boolean is(Z t) {
    final HashSet<Z> seen = new HashSet<>();
    while (!Predicates.POWER_OF_TWO.is(t)) {
      final Z t2 = t.multiply2();
      t = t2.subtract(Functions.ALIQUOT.z(t2).subtract(1));
      if (t.signum() <= 0 || !seen.add(t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN);
      if (is(t)) {
        return t;
      }
    }
  }
}
