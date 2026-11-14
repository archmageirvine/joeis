package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087376 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long j = 0;
    for (long k = 0; k < mN; ++k) {
      do {
        ++j;
      } while (!Predicates.PRIME.is(mN * j + 1));
    }
    return Z.valueOf(j);
  }
}
