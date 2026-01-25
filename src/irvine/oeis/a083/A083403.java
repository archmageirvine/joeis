package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083403 Write the numbers 1, 2, ... in a triangle with n terms in the n-th row; a(n) = number of squarefree integers in n-th row.
 * @author Sean A. Irvine
 */
public class A083403 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      if (Predicates.SQUARE_FREE.is(++mM)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
