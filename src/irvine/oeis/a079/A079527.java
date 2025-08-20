package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079527 a(n) = floor( exp(H_n)*log(H_n) ).
 * @author Sean A. Irvine
 */
public class A079527 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();

  @Override
  public Z next() {
    final CR h = CR.valueOf(mH.nextQ());
    return h.exp().multiply(h.log()).floor();
  }
}
