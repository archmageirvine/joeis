package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-26.ack/lambdan at 2025-07-26 21:09

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a005.A005361;
import irvine.oeis.a007.A007814;

/**
 * A386258 Exponent of the highest power of 2 dividing the product of exponents of the prime factorization of n.
 * @author Georg Fischer
 */
public class A386258 extends LambdaSequence {

  private static final DirectSequence A005361 = new A005361();
  private static final DirectSequence A007814 = new A007814();

  /** Construct the sequence. */
  public A386258() {
    super(1, n -> A007814.a(A005361.a(n)));
  }
}
