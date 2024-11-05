package irvine.oeis.a072;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072913 Numerators of (1/4!)*(H(n,1)^4+6*H(n,1)^2*H(n,2)+8*H(n,1)*H(n,3)+3*H(n,2)^2+6*H(n,4)), where H(n,m) = Sum_{i=1..n} 1/i^m are generalized harmonic numbers.
 * @author Sean A. Irvine
 */
public class A072913 extends Sequence1 {

  private final HarmonicSequence mH1 = new HarmonicSequence(1);
  private final HarmonicSequence mH2 = new HarmonicSequence(2);
  private final HarmonicSequence mH3 = new HarmonicSequence(3);
  private final HarmonicSequence mH4 = new HarmonicSequence(4);

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final Q h1 = mH1.nextQ();
    final Q h2 = mH2.nextQ();
    final Q h3 = mH3.nextQ();
    final Q h4 = mH4.nextQ();
    final Q t = h1.pow(4)
      .add(h1.square().multiply(h2).multiply(6))
      .add(h1.multiply(h3).multiply(8))
      .add(h2.square().multiply(3))
      .add(h4.multiply(6))
      .divide(24);
    return select(t);
  }
}

