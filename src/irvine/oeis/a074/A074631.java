package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074631 extends A002808 {

  private long mN = 0;
  private long mM = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Q n = Q.valueOf(++mN);
    while (mSum.compareTo(n) <= 0) {
      mSum = mSum.add(new Q(Z.ONE, super.next()));
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
