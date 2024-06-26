package irvine.oeis.a157;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001349;
import irvine.oeis.a005.A005142;

/**
 * A157051 Number of connected unlabeled non-bipartite graphs on n nodes.
 * @author Georg Fischer
 */
public class A157051 extends AbstractSequence {

  private final A001349 mSeq1 = new A001349();
  private final A005142 mSeq2 = new A005142();

  /** Construct the sequence. */
  public A157051() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
