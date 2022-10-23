package irvine.oeis.a055;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055980 a(n) = floor(Sum_{i=1..n} 1/i).
 * @author Sean A. Irvine
 */
public class A055980 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();

  @Override
  public Z next() {
    return mH.nextQ().toZ();
  }
}
