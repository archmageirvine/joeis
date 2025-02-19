package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-30.ack/filnum at 2024-12-30 19:33

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A378115 Numbers k such that (23^k + 2^k)/25 is prime.
 * @author Georg Fischer
 */
public class A378115 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A378115() {
    super(1, 0, k -> {
      final Z v = Z.valueOf(23).pow(k).add(Z.TWO.pow(k));
      return v.mod(25) == 0 && Predicates.PRIME.is(v.divide(25));
    });
  }
}
