package irvine.oeis.a189;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002854;
import irvine.oeis.a133.A133736;

/**
 * A189771 Number of simple graphs on n nodes that are Euler (all nodes even) but not Eulerian (single cycle passes through all edges).
 * @author Georg Fischer
 */
public class A189771 extends AbstractSequence {

  private final A002854 mSeq1 = new A002854();
  private final A133736 mSeq2 = new A133736();

  /** Construct the sequence. */
  public A189771() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
