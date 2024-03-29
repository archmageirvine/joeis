package irvine.oeis.a161;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.oeis.MultiplicativeSequence;

/**
 * A161946 Odd part of sum of unitary divisors of n.
 * Multiplicative with: a(p^e) = oddpart(p^e+1), where oddpart(n) = A000265(n) is the largest odd divisor of n.
 * @author Georg Fischer
 */
public class A161946 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A161946() {
    super(1, (p, e) -> p.pow(e).add(1).makeOdd());
  }
}
