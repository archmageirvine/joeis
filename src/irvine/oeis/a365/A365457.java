package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a005.A005940;

/**
 * A365457 a(n) = A365456(A005940(n)), where A365456(n) = A156552(2*n) / gcd(sigma(n), A156552(2*n)), and A156552 is the inverse of offset-0 version of Doudna-sequence, A005940.
 * @author Georg Fischer
 */
public class A365457 extends LambdaSequence {

  private static final DirectSequence A005940 = new A005940();
  private static final DirectSequence A365456 = new A365456();

  /** Construct the sequence. */
  public A365457() {
    super(1, n -> A365456.a(A005940.a(n)));
  }
}
