package irvine.oeis.a079;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A126706 Positive integers which are neither squarefree integers nor prime powers.
 * @author Sean A. Irvine
 */
public class A126706 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.SQUARE_FREE.is(++mN) && !Predicates.PRIME_POWER.is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
