package irvine.oeis.a350;
// Generated by gen_seq4.pl 2025-06-25.ack/lambdan at 2025-06-25 23:22

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A350338 Number of nontrivial divisors of n that are the product of up to 3 (not necessarily distinct) primes.
 * @author Georg Fischer
 */
public class A350338 extends LambdaSequence {

  /** Construct the sequence. */
  public A350338() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> d > 1 && Functions.BIG_OMEGA.i(d) <= 3 ? Z.ONE : Z.ZERO));
  }
}
