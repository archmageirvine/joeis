package irvine.oeis.a356;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356785 E.g.f. satisfies log(A(x)) = x * (exp(x*A(x)) - 1) * A(x).
 * @author Georg Fischer
 */
public class A356785 extends LambdaSequence {

  /** Construct the sequence. */
  public A356785() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 2, k -> new Q(Z.valueOf(n + 1)).pow(k - 1).multiply(Stirling.secondKind(n - k, k)).divide(MemoryFactorial.SINGLETON.factorial(n - k))).multiply(MemoryFactorial.SINGLETON.factorial(n)).num());
  }
}
