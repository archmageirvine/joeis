package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A082184 The a(n)-th triangular number is the sum of the n-th triangular number and the smallest triangular number possible.
 * @author Sean A. Irvine
 */
public class A082184 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).multiply(mN + 1);
    long j = mN;
    while (true) {
      ++j;
      if (Predicates.SQUARE.is(Z.valueOf(j).multiply(j + 1).subtract(t).multiply(4).add(1))) {
        return Z.valueOf(j);
      }
    }
  }
}
