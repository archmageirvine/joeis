package irvine.oeis.a065;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.oeis.MultiplicativeSequence;

/**
 * A065958 a(n) = n^2*Product_{distinct primes p dividing n} (1+1/p^2).
 * @author Georg Fischer
 */
public class A065958 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A065958() {
    super(1, (p, e) -> p.pow(2L * e).add(p.pow(2L * e - 2)));
  }
}
