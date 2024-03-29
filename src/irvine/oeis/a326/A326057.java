package irvine.oeis.a326;
// Generated by gen_seq4.pl 2023-09-29/gcd2an at 2023-10-03 20:19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a252.A252748;
import irvine.oeis.a286.A286385;

/**
 * A326057 a(n) = gcd(A003961(n)-2n, A003961(n)-sigma(n)), where A003961(n) is fully multiplicative function with a(prime(k)) = prime(k+1).
 * @author Georg Fischer
 */
public class A326057 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A252748();
  private final AbstractSequence mSeq2 = new A286385();

  /** Construct the sequence. */
  public A326057() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}

