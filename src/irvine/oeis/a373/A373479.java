package irvine.oeis.a373;
// Generated by gen_seq4.pl 2025-05-30.ack/setdiff at 2025-05-30 21:48

import irvine.oeis.SetDifferenceSequence;

/**
 * A373479 Numbers k such that A001414(k) and A003415(k) are both multiples of 3, but A083345(k) is not, where A001414 is the sum of prime factors with repetition, A003415 is the arithmetic derivative, and A083345(n) = A003415(n)/gcd(n,A003415(n)).
 * @author Georg Fischer
 */
public class A373479 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A373479() {
    super(1, new A373478(), new A373475());
  }
}
