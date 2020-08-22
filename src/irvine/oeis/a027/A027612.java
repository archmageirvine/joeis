package irvine.oeis.a027;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027612 Numerator of 1/n + 2/(n-1) + 3/(n-2) +...+ (n-1)/2 + n.
 * @author Sean A. Irvine
 */
public class A027612 implements Sequence {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = 1;
  {
    mH.nextQ();
  }

  @Override
  public Z next() {
    return mH.nextQ().subtract(1).multiply(++mN).num();
  }
}
