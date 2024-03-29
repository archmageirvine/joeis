package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A367134 E.g.f. satisfies A(x) = 1/(2 - exp(x*A(x)^2)).
 * @author Georg Fischer
 */
public class A367134 extends LambdaSequence {

  /** Construct the sequence. */
  public A367134() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Stirling.secondKind(n, k).multiply(MemoryFactorial.SINGLETON.factorial(2 * n + k))).divide(MemoryFactorial.SINGLETON.factorial(2 * n + 1)));
  }
}
