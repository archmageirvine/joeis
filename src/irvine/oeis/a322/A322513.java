package irvine.oeis.a322;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A322513 Expansion of e.g.f. log(1 + Sum_{k&gt;=1} d(k) * x^k / k!), where d(k) = number of divisors of k (A000005).
 * @author Georg Fischer
 */
public class A322513 extends AbstractSequence {

  private int mN = -1;
  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A000005(), 0);

  /** Construct the sequence. */
  public A322513() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : mSeq1.next();
  }
}
