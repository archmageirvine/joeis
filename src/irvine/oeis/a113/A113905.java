package irvine.oeis.a113;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a022.A022559;

/**
 * A113905 omega(n!) raised to the power of bigomega(n!).
 * @author Georg Fischer
 */
public class A113905 extends AbstractSequence {

  private int mN = -1;
  private final A000720 mSeq1 = new A000720();
  private final A022559 mSeq2 = new A022559();

  /** Construct the sequence. */
  public A113905() {
    super(0);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq1.next().pow(mSeq2.next());
  }
}
