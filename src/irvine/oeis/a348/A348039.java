package irvine.oeis.a348;
// Generated by gen_seq4.pl 2023-09-29/gcd2an at 2023-10-03 20:19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003557;
import irvine.oeis.a327.A327564;

/**
 * A348039 a(n) = gcd(A003557(n), A327564(n)).
 * @author Georg Fischer
 */
public class A348039 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A003557();
  private final AbstractSequence mSeq2 = new A327564();

  /** Construct the sequence. */
  public A348039() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}

