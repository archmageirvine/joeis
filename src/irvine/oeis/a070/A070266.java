package irvine.oeis.a070;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070266 Maximum element in the simple continued fraction expansion of H(n) = 1+1/2+1/3+...+1/n, the n-th harmonic number.
 * @author Sean A. Irvine
 */
public class A070266 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();

  @Override
  public Z next() {
    return Functions.MAX.z(ContinuedFractionUtils.continuedFraction(mH.nextQ()));
  }
}
