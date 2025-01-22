package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074663.
 * @author Sean A. Irvine
 */
public class A074467 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Q n = Q.valueOf(++mN);
    while (mSum.compareTo(n) < 0) {
      mSum = mSum.add(new Q(1, Functions.PHI.l(++mM)));
    }
    return Z.valueOf(mM);
  }
}

