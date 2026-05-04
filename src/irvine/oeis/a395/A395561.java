package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A395561 allocated for Aradhya Haldikar.
 * @author Sean A. Irvine
 */
public class A395561 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Predicates.PRIME.is(mN - k) && !Predicates.PRIME.is(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}
