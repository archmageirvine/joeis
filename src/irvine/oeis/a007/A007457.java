package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007457 Number of (j,k): j+k=n, (j,n)=(k,n)=1, j,k squarefree.
 * @author Sean A. Irvine
 */
public class A007457 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long j = 1; j < mN; ++j) {
      if (Functions.GCD.l(j, mN) == 1 && Predicates.SQUARE_FREE.is(j)) {
        final long k = mN - j;
        if (Functions.GCD.l(k, mN) == 1 && Predicates.SQUARE_FREE.is(k)) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}

