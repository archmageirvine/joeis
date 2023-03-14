package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061485 Numerator of 1/(2n-1) + 3/(2n-3) + 5/(2n-5) + ...(2n-1)/1.
 * @author Sean A. Irvine
 */
public class A061485 extends Sequence1 {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    Q a = Q.ZERO;
    for (long k = 1; k <= mN; k += 2) {
      a = a.add(new Q(k, mN + 1 - k));
    }
    return select(a);
  }
}

