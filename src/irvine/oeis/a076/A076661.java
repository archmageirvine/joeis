package irvine.oeis.a076;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076661 Index of first term of the harmonic sequence having the same denominator as the partial harmonic sequence beginning with 1/n.
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
