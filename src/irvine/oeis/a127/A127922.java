package irvine.oeis.a127;
// manually anopan 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A127922 1/24 of product of three numbers: n-th prime, previous and following number.
 * @author Georg Fischer
 */
public class A127922 extends AbstractSequence {

  private final A000040 mSeq1 = new A000040();

  /** Construct the sequence. */
  public A127922() {
    super(2);
    mSeq1.next();
  }

  @Override
  public Z next() {
    final Z p = mSeq1.next();
    return p.multiply(p.subtract(1)).multiply(p.add(1)).divide(24);
  }
}
