package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A351091 a(n) = Product_{d|A000265(n)} A019565(A289813(d)); a product obtained from the 1-digits present in ternary expansions of the odd divisors of n.
 * @author Georg Fischer
 */
public class A351091 extends LambdaSequence {

  private static final DirectSequence A351081 = new A351081();

  /** Construct the sequence. */
  public A351091() {
    super(1, n -> A351081.a(Functions.MAKE_ODD.z(n)));
  }
}
