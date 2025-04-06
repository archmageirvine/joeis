package irvine.oeis.a060;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060859 Powerful numbers of the form k^2 - 1.
 * @author Sean A. Irvine
 */
public class A060859 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square().subtract(1);
      if (Predicates.POWERFUL.is(n2)) {
        return n2;
      }
    }
  }
}
