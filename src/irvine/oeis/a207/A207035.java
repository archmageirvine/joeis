package irvine.oeis.a207;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a138.A138137;
import irvine.oeis.a138.A138879;

/**
 * A207035 Sum of all parts minus the total number of parts of the last section of the set of partitions of n.
 * @author Georg Fischer
 */
public class A207035 extends AbstractSequence {

  private final A138879 mSeq1 = new A138879();
  private final A138137 mSeq2 = new A138137();

  /** Construct the sequence. */
  public A207035() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
