package irvine.oeis.a358;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A358389 a(n) = n * Sum_{d|n} (d + n/d - 2)!/d!.
 * @author Georg Fischer
 */
public class A358389 extends LambdaSequence {

  /** Construct the sequence. */
  public A358389() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(MemoryFactorial.SINGLETON.factorial(d + n / d - 2), MemoryFactorial.SINGLETON.factorial(d))).multiply(Z.valueOf(n)).num());
  }
}
