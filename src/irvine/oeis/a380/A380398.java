package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-10.ack/lambdan at 2025-02-10 21:26

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A380398 The number of unitary divisors of n that are perfect powers (A001597).
 * @author Georg Fischer
 */
public class A380398 extends LambdaSequence {

  /** Construct the sequence. */
  public A380398() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.GCD.i(d, n / d) == 1 && (d == 1 || Predicates.POWER.is(d)) ? Z.ONE : Z.ZERO));
  }
}
