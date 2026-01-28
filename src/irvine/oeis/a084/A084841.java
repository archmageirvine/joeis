package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084841 Write the numbers 1, 2, ... in a triangle with n terms in the n-th row; a(n) = number of deficient integers in n-th row.
 * @author Sean A. Irvine
 */
public class A084841 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      if (Predicates.DEFICIENT.is(++mM)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
