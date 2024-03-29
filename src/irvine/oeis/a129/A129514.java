package irvine.oeis.a129;
// Generated by gen_seq4.pl 2023-09-29/gcd2an at 2023-10-03 20:19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a000.A000217;

/**
 * A129514 a(n) = gcd(Sum_{k|n} k, Sum_{1&lt;k&lt;n, k does not divide n} k) = gcd(sigma(n), n(n+1)/2 - sigma(n)) = gcd(sigma(n), n(n+1)/2), where sigma(n) = A000203(n).
 * @author Georg Fischer
 */
public class A129514 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A000203();
  private final AbstractSequence mSeq2 = new A000217().skip(1);

  /** Construct the sequence. */
  public A129514() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}

