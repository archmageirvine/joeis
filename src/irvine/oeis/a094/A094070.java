package irvine.oeis.a094;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000085;
import irvine.oeis.a000.A000110;

/**
 * A094070 a(n) = A000085(n) * A000110(n).
 * @author Georg Fischer
 */
public class A094070 extends AbstractSequence {

  private final A000085 mSeq1 = new A000085();
  private final A000110 mSeq2 = new A000110();

  /** Construct the sequence. */
  public A094070() {
    super(0);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
