package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074633 extends Sequence1 {

  private final Sequence mPrimePi = new A000720().skip();
  private long mN = 0;
  private long mM = 1;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Q n = Q.valueOf(++mN);
    while (mSum.compareTo(n) < 0) {
      mSum = mSum.add(new Q(Z.ONE, mPrimePi.next()));
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
