package irvine.oeis.a065;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065454 Let the k-th harmonic number be H(k) = Sum_{i=1..k} 1/i = P(k)/Q(k) = A001008(k)/A002805(k); sequence gives values of k such that Q(k) = Q(k+1).
 * @author Sean A. Irvine
 */
public class A065454 extends Sequence1 {

  private long mN = 0;
  private final HarmonicSequence mH = new HarmonicSequence();
  private Q mA = mH.nextQ();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q b = mA;
      mA = mH.nextQ();
      if (b.den().equals(mA.den())) {
        return Z.valueOf(mN);
      }
    }
  }
}
