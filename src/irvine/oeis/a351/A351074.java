package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-06-20/lambdan at 2024-06-20 23:44

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a051.A051903;
import irvine.oeis.a328.A328391;

/**
 * A351074 Difference between the maximal exponent in the prime factorization of A327860(n) and the maximal exponent in the prime factorization of n.
 * @author Georg Fischer
 */
public class A351074 extends LambdaSequence {

  private static final DirectSequence A051903 = new A051903();
  private static final DirectSequence A328391 = new A328391();

  /** Construct the sequence. */
  public A351074() {
    super(1, n -> A328391.a(n).subtract(A051903.a(n)));
  }
}
