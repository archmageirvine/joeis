package irvine.oeis.a328;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A328053 Expansion of e.g.f. log(1 + Sum_{k&gt;=1} phi(k) * x^k / k!), where phi = Euler totient function (A000010).
 * @author Georg Fischer
 */
public class A328053 extends AbstractSequence {

  private int mN = -1;
  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A000010(), 0);

  /** Construct the sequence. */
  public A328053() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : mSeq1.next();
  }
}
