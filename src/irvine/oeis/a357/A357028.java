package irvine.oeis.a357;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A357028 E.g.f. satisfies A(x) = (1 - x * A(x))^log(1 - x * A(x)).
 * @author Georg Fischer
 */
public class A357028 extends LambdaSequence {

  /** Construct the sequence. */
  public A357028() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 2, k -> new Q(n + 1).pow(k - 1).multiply(Stirling.firstKind(n, 2 * k).abs()).multiply(MemoryFactorial.SINGLETON.factorial(2 * k)).divide(MemoryFactorial.SINGLETON.factorial(k))).num());
  }
}
