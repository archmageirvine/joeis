package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066925 Numbers k having a partition k = sum x_i for which sum k/x_i is the same partition of k.
 * @author Sean A. Irvine
 */
public class A066925 extends Sequence1 {

  private long mN = 0;

  private boolean isSelfInverse(final long n, final long x, final long[] terms, final int pos) {
    if (pos >= terms.length || x < 0) {
      return false;
    }
    if (x == 0) {
      return true;
    }
    if (Predicates.SQUARE.is(n) && isSelfInverse(n, x - LongUtils.sqrt(n), terms, pos)) {
      return true;
    }
    if (n % terms[pos] == 0 && isSelfInverse(n, x - terms[pos] - n / terms[pos], terms, pos)) {
      return true;
    }
    return isSelfInverse(n, x, terms, pos + 1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (isSelfInverse(mN, mN, ZUtils.toLong(Jaguar.factor(mN).divisorsSorted()), 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
