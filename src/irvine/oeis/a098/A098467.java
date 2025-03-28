package irvine.oeis.a098;
// Generated by gen_seq4.pl 2025-03-28.ack/filnum at 2025-03-28 22:47

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A098467 Numbers k such that N*2^k + 1 is prime where N = 9999999999999999999999988888888888888888887777777777777777766666666666665555555555544444443333322211.
 * @author Georg Fischer
 */
public class A098467 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A098467() {
    super(1, 0, k -> Predicates.PRIME.is(Z.TWO.pow(k).multiply(new Z("9999999999999999999999988888888888888888887777777777777777766666666666665555555555544444443333322211")).add(1)));
  }
}
