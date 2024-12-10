package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073599 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private Q mPhiSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mPhiSum = mPhiSum.add(new Q(1, Functions.PHI.z(++mN)));
      if (mH.nextQ().den().mod(mPhiSum.den()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
