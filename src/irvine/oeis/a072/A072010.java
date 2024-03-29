package irvine.oeis.a072;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A072010 In prime factorization of n replace all primes of form k*4+1 with k*4+3 and primes of form k*4+3 with k*4+1.
 * @author Georg Fischer
 */
public class A072010 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A072010() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE.shiftLeft(e) : (p.mod(Z.FOUR).equals(Z.ONE) ? p.add(2).pow(e) : p.subtract(2).pow(e)));
  }
}
