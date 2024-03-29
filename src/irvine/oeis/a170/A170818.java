package irvine.oeis.a170;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A170818 a(n) is the product of primes (with multiplicity) of form 4*k+1 that divide n.
 * @author Georg Fischer
 */
public class A170818 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A170818() {
    super(1, (p, e) -> p.mod(Z.FOUR).equals(Z.ONE) ? p.pow(e) : Z.ONE);
  }
}
