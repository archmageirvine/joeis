package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-26/lambdan at 2024-02-26 19:18

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A370580 a(n) = (n-1)! * Sum_{d|n} d/(d-1)!.
 * @author Georg Fischer
 */
public class A370580 extends LambdaSequence {

  /** Construct the sequence. */
  public A370580() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Z.valueOf(d), MemoryFactorial.SINGLETON.factorial(d - 1))).multiply(MemoryFactorial.SINGLETON.factorial(n - 1)).num());
  }
}
