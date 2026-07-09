package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085761 Number of triangular numbers between n and 2n (inclusive).
 * @author Sean A. Irvine
 */
public class A085761 extends Sequence1 {

  private long mN = 0;
  private long mCount = 1;
  private long mT = 1;

  @Override
  public Z next() {
    while (Functions.TRIANGULAR.l(mT) <= 2 * (mN + 1)) {
      ++mCount;
      ++mT;
    }
    if (Predicates.TRIANGULAR.is(mN)) {
      --mCount;
    }
    ++mN;
    return Z.valueOf(mCount);
  }
}
