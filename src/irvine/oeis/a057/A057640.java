package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057640 a(n) = floor(H(n) + exp(H(n))*log(H(n))), where H(n) = Sum_{k=1..n} 1/k.
 * @author Sean A. Irvine
 */
public class A057640 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();

  @Override
  public Z next() {
    final CR ch = CR.valueOf(mH.nextQ());
    return ch.exp().multiply(ch.log()).add(ch).floor();
  }
}
