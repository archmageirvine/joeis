package irvine.oeis.a347;
// Generated by gen_seq4.pl 2023-09-29/gcd2an at 2023-10-03 20:19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a055.A055155;

/**
 * A347089 a(n) = gcd(A055155(n), d(n)), where A055155(n) = Sum_{d|n} gcd(d, n/d) and d(n) gives the number of divisors of n.
 * @author Georg Fischer
 */
public class A347089 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A000005();
  private final AbstractSequence mSeq2 = new A055155();

  /** Construct the sequence. */
  public A347089() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}

