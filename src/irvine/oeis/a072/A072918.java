package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a013.A013632;

/**
 * A072918 a(n) = p(n) - sigma(n), where p(n) is the least prime greater than sigma(n).
 * @author Georg Fischer
 */
public class A072918 extends LambdaSequence {

  private static final DirectSequence A013632 = new A013632();

  /** Construct the sequence. */
  public A072918() {
    super(1, n -> A013632.a(Functions.SIGMA.z(1, n)));
  }
}
