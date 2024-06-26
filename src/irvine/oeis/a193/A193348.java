package irvine.oeis.a193;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001227;

/**
 * A193348 Number of odd divisors of tau(n).
 * @author Georg Fischer
 */
public class A193348 extends LambdaSequence {

  private static final DirectSequence A001227 = new A001227();

  /** Construct the sequence. */
  public A193348() {
    super(1, n -> A001227.a(Functions.SIGMA.z(0, n)));
  }
}
