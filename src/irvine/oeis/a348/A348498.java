package irvine.oeis.a348;
// Generated by gen_seq4.pl 2023-09-29/gcd2an at 2023-10-03 20:19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a342.A342001;
import irvine.oeis.a347.A347129;

/**
 * A348498 a(n) = gcd(A003415(n), A347130(n)) / A003557(n), where A003415 is the arithmetic derivative and A347130 is its Dirichlet convolution with the identity function.
 * @author Georg Fischer
 */
public class A348498 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A342001();
  private final AbstractSequence mSeq2 = new A347129();

  /** Construct the sequence. */
  public A348498() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}

