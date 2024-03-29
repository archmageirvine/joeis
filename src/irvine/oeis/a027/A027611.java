package irvine.oeis.a027;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027611 Denominator of n * n-th harmonic number.
 * @author Sean A. Irvine
 */
public class A027611 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = 0;

  @Override
  public Z next() {
    return mH.nextQ().subtract(1).multiply(++mN).den();
  }
}
