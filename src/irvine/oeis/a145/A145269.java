package irvine.oeis.a145;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a005.A005470;

/**
 * A145269 Number of simple nonplanar graphs on n nodes.
 * @author Georg Fischer
 */
public class A145269 extends AbstractSequence {

  private final A000088 mSeq1 = new A000088();
  private final A005470 mSeq2 = new A005470();

  /** Construct the sequence. */
  public A145269() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
