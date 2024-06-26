package irvine.oeis.a247;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.a057.A057620;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A247816 a(n) is the smallest k such that prime(k+i) = 1 (mod 6) for i = 0, 1,...,n-1.
 * @author Georg Fischer
 */
public class A247816 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A247816() {
    super(1, new A057620(), v -> Functions.PRIME_PI.z(v));
  }
}
