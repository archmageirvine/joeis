package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087377 Triangle read by rows: n-th row contains n smallest numbers k (say) such that nk+1 is a prime.
 * @author Sean A. Irvine
 */
public class A087377 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mK = 0;
    }
    do {
      ++mK;
    } while (!Predicates.PRIME.is(mN * mK + 1));
    return Z.valueOf(mK);
  }
}
