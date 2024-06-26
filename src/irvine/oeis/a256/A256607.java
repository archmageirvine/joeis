package irvine.oeis.a256;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007733;

/**
 * A256607 Eventual period of 2^(2^k) mod n.
 * @author Georg Fischer
 */
public class A256607 extends LambdaSequence {

  private static final DirectSequence A007733 = new A007733();

  /** Construct the sequence. */
  public A256607() {
    super(1, n -> A007733.a(A007733.a(n)));
  }
}
