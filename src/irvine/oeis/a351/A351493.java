package irvine.oeis.a351;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A351493 Expansion of e.g.f. (1 - x)^(-x^3/6).
 * @author Georg Fischer
 */
public class A351493 extends LambdaSequence {

  /** Construct the sequence. */
  public A351493() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Stirling.firstKind(n - 3 * k, k).abs(), Z.SIX.pow(k).multiply(MemoryFactorial.SINGLETON.factorial(n - 3 * k)))).multiply(MemoryFactorial.SINGLETON.factorial(n)).num());
  }
}
