package irvine.oeis.a347;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A347239 Sum of A347236 and its Dirichlet inverse.
 * @author Georg Fischer
 */
public class A347239 extends AbstractSequence {

  private final A347236 mSeq1 = new A347236();
  private final A347238 mSeq2 = new A347238();

  /** Construct the sequence. */
  public A347239() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
