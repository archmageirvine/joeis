package irvine.oeis.a083;
// Generated by gen_seq4.pl 2025-04-22.ack/lambdan at 2025-04-22 22:21

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A083721 Number of primes greater than the greatest prime factor of n but not greater than n.
 * @author Georg Fischer
 */
public class A083721 extends LambdaSequence {

  /** Construct the sequence. */
  public A083721() {
    super(1, n -> Integers.SINGLETON.count(Functions.GPF.i(n) + 1, n, k -> Predicates.PRIME.is(k)));
  }
}
