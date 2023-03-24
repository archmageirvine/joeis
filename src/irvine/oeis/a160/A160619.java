package irvine.oeis.a160;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a034.A034738;

/**
 * A160619 a(n) = Sum_{d|n} phi(n/d)*2^(d+1), with a(0) = 0.
 * @author Georg Fischer
 */
public class A160619 extends AbstractSequence {

  private int mN = -1;
  private final A034738 mSeq = new A034738();

  /** Construct the sequence. */
  public A160619() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.FOUR.multiply(mSeq.next());
  }
}
