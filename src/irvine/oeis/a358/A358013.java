package irvine.oeis.a358;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A358013 Expansion of e.g.f. 1/(1 - x^2 * (exp(x) - 1)).
 * @author Georg Fischer
 */
public class A358013 extends LambdaSequence {

  /** Construct the sequence. */
  public A358013() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(MemoryFactorial.SINGLETON.factorial(k).multiply(Stirling.secondKind(n - 2 * k, k)), MemoryFactorial.SINGLETON.factorial(n - 2 * k))).multiply(MemoryFactorial.SINGLETON.factorial(n)).num());
  }
}
