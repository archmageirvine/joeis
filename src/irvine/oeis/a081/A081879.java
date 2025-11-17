package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081879 Number of steps for convergence (to 1 or 3) for the process in A081878.
 * @author Sean A. Irvine
 */
public class A081879 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 1 && m != 3) {
      ++cnt;
      if ((m & 1) == 0) {
        m /= 2;
      } else if (Predicates.PRIME.is(m)) {
        m += 3;
      } else {
        ++m;
      }
    }
    return Z.valueOf(cnt);
  }
}
