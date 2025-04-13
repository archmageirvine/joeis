package irvine.oeis.a076;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076585.
 * @author Sean A. Irvine
 */
public class A076661 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HarmonicSequence seq = new HarmonicSequence();
    long k = 0;
    while (k + 1 < mN) {
      seq.nextQ();
      ++k;
    }
    long j = mN;
    Q sum = Q.ZERO;
    while (true) {
      ++k;
      sum = sum.add(new Q(1, j++));
      if (sum.den().equals(seq.nextQ().den())) {
        return Z.valueOf(k);
      }
    }
  }
}
