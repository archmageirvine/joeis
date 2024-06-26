package irvine.oeis.a336;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007814;

/**
 * A336937 The 2-adic valuation of sigma(n), the sum of divisors of n.
 * @author Georg Fischer
 */
public class A336937 extends LambdaSequence {

  private static final DirectSequence A007814 = new A007814();

  /** Construct the sequence. */
  public A336937() {
    super(1, n -> A007814.a(Functions.SIGMA.z(1, n)));
  }
}
