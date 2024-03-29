package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A367161 E.g.f. satisfies A(x) = 1 + A(x)^3 * (exp(x) - 1).
 * @author Georg Fischer
 */
public class A367161 extends LambdaSequence {

  /** Construct the sequence. */
  public A367161() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Stirling.secondKind(n, k).multiply(MemoryFactorial.SINGLETON.factorial(3 * k)), MemoryFactorial.SINGLETON.factorial(2 * k + 1))).num());
  }
}
