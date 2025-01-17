package irvine.oeis.a319;
// Generated by gen_seq4.pl 2025-01-01.ack/rgs1 at 2025-01-01 23:25

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A319706 Filter sequence which for primes p records the prime signature of 2p+1, and for all other numbers assigns a unique number.
 * @author Georg Fischer
 */
public class A319706 extends RestrictedGrowthTransformSequence {

  private static final DirectSequence A046523 = new A046523();

  /** Construct the sequence. */
  public A319706() {
    super(1, new LambdaSequence(1, n -> Predicates.PRIME.is(n) ? A046523.a(2 * n + 1) : Z.valueOf(-n)));
  }
}
