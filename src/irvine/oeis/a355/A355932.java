package irvine.oeis.a355;
// Generated by gen_seq4.pl 2023-09-29/gcd2an at 2023-10-03 20:19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a003.A003973;

/**
 * A355932 a(n) = gcd(sigma(n), sigma(A003961(n))), where A003961 is fully multiplicative with a(p) = nextprime(p).
 * @author Georg Fischer
 */
public class A355932 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A000203();
  private final AbstractSequence mSeq2 = new A003973();

  /** Construct the sequence. */
  public A355932() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}

