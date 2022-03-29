package irvine.oeis.a055;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055573 Number of terms in simple continued fraction for n-th harmonic number H_n = Sum_{k=1..n} (1/k).
 * @author Sean A. Irvine
 */
public class A055573 implements Sequence {

  private final HarmonicSequence mH = new HarmonicSequence();

  private long continuedFractionLength(Q n) {
    long cnt = 0;
    while (true) {
      ++cnt;
      final Z t = n.toZ();
      n = n.subtract(t);
      if (Q.ZERO.equals(n)) {
        return cnt;
      }
      n = n.reciprocal();
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(continuedFractionLength(mH.nextQ()));
  }
}
