package irvine.oeis.a308;
// Generated by gen_seq4.pl 2024-05-29/lambdan at 2024-05-29 02:16

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A308554 Expansion of e.g.f. Sum_{k&gt;=1} tau(k)*(exp(x) - 1)^k/k!, where tau = number of divisors (A000005).
 * @author Georg Fischer
 */
public class A308554 extends LambdaSequence {

  /** Construct the sequence. */
  public A308554() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.STIRLING2.z(n, k).multiply(Functions.TAU.z(k))));
  }
}
