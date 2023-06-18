package irvine.oeis.a064;

import irvine.math.api.RationalSequence;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064158.
 * @author Sean A. Irvine
 */
public class A064167 extends Sequence1 {

  private final RationalSequence mH = new HarmonicSequence();

  @Override
  public Z next() {
    final Q h = mH.nextQ();
    return h.num().multiply(h.den());
  }
}

