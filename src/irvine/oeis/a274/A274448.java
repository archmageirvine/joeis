package irvine.oeis.a274;
// Generated by gen_seq4.pl 2023-09-29/gcd3an at 2023-10-03 20:19

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001662;
import irvine.oeis.a051.A051711;

/**
 * A274448 Denominators in expansion of W(exp(x)) about x=1, where W is the Lambert function.
 * @author Georg Fischer
 */
public class A274448 extends AbstractSequence {

  private int mN = -1;
  private final AbstractSequence mSeq1 = new A051711().skip(1);
  private final AbstractSequence mSeq2 = new A001662().skip(1);

  /** Construct the sequence. */
  public A274448() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : new Q(mSeq1.next(), mSeq2.next()).num().abs();
  }
}

