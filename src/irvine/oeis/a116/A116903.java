package irvine.oeis.a116;
// manually roban1/adjext at 2026-10-06 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a323.A323188;

/**
 * A116903 Seaweeds(n): number of n-step self-avoiding walks on upper two quadrants grid starting at origin.
 * @author Georg Fischer
 */
public class A116903 extends AbstractSequence {

  private final Sequence mSeq = new A323188();

  /** Construct the sequence */
  public A116903() {
    super(0);
  }

  @Override
  public Z next() {
    final Z result = mSeq.next().divide(4);
    mSeq.next();
    return result;
  }
}
