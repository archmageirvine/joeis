package irvine.oeis.a027;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027611 Denominator of <code>n * n-th</code> harmonic number.
 * @author Sean A. Irvine
 */
public class A027611 implements Sequence {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = 0;

  @Override
  public Z next() {
    return mH.nextQ().subtract(1).multiply(++mN).den();
  }
}
