package irvine.oeis.a342;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;

/**
 * A342712 Partial sums of A248333.
 * @author Georg Fischer
 */
public class A342712 extends AbstractSequence {

  private final A000217 mSeq1 = new A000217();
  private final A342711 mSeq2 = new A342711();

  /** Construct the sequence. */
  public A342712() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
