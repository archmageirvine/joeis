package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081878 Triangle read by rows in which row n begins with n and iterates the process of dividing n by 2 if n is even, adding 3 if n is an odd prime, otherwise adding 1; stopping when either 1 or 3 is reached.
 * @author Sean A. Irvine
 */
public class A081878 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (mM == 1 || mM == 3) {
      mM = ++mN;
    } else if ((mM & 1) == 0) {
      mM /= 2;
    } else if (Predicates.PRIME.is(mM)) {
      mM += 3;
    } else {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
