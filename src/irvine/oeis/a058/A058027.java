package irvine.oeis.a058;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058027 Sum of terms of continued fraction for n-th harmonic number, 1 + 1/2 + 1/3 + ... + 1/n.
 * @author Sean A. Irvine
 */
public class A058027 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();

  @Override
  public Z next() {
    return ContinuedFractionUtils.continuedFractionSum(mH.nextQ());
  }
}
