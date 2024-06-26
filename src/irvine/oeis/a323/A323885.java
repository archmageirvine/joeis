package irvine.oeis.a323;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001511;
import irvine.oeis.a092.A092673;

/**
 * A323885 Sum of A001511 and its Dirichlet inverse.
 * @author Georg Fischer
 */
public class A323885 extends AbstractSequence {

  private final A001511 mSeq1 = new A001511();
  private final A092673 mSeq2 = new A092673();

  /** Construct the sequence. */
  public A323885() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
