package irvine.oeis.a064;

import irvine.math.api.RationalSequence;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064168 Sum of numerator and denominator in n-th harmonic number, 1 + 1/2 + 1/3 +...+ 1/n.
 * @author Sean A. Irvine
 */
public class A064168 extends Sequence1 {

  private final RationalSequence mH = new HarmonicSequence();

  @Override
  public Z next() {
    final Q h = mH.nextQ();
    return h.num().add(h.den());
  }
}

