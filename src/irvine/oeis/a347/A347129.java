package irvine.oeis.a347;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003557;

/**
 * A347129 a(n) = A347130(n) / A003557(n), where A347130 is the Dirichlet convolution of the identity function with the arithmetic derivative of n.
 * @author Georg Fischer
 */
public class A347129 extends AbstractSequence {

  private final A347130 mSeq1 = new A347130();
  private final A003557 mSeq2 = new A003557();

  /** Construct the sequence. */
  public A347129() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
