package irvine.oeis.a116;
// Generated by gen_seq4.pl 2025-04-04.ack/lambdan at 2025-04-04 23:53

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A116869 Sixth column of triangle A028364.
 * @author Georg Fischer
 */
public class A116869 extends LambdaSequence {

  /** Construct the sequence. */
  public A116869() {
    super(0, n -> Integers.SINGLETON.sum(0, 5, k -> Functions.CATALAN.z(k).multiply(Functions.CATALAN.z(n + 5 - k))));
  }
}
