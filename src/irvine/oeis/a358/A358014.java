package irvine.oeis.a358;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A358014 Expansion of e.g.f. 1/(1 - x^3 * (exp(x) - 1)).
 * @author Georg Fischer
 */
public class A358014 extends LambdaSequence {

  /** Construct the sequence. */
  public A358014() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(MemoryFactorial.SINGLETON.factorial(k).multiply(Stirling.secondKind(n - 3 * k, k)), MemoryFactorial.SINGLETON.factorial(n - 3 * k))).multiply(MemoryFactorial.SINGLETON.factorial(n)).num());
  }
}
