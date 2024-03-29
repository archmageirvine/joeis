package irvine.oeis.a069;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A069088 a(n) = Sum_{d|n} core(d) where d are the divisors of n and where core(d) is the squarefree part of d: the smallest number such that d*core(d) is a square.
 * @author Georg Fischer
 */
public class A069088 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A069088() {
    super(1, (p, e) -> ((e & 1) == 1) ? p.add(1).multiply(e + 1).divide2() : p.add(1).multiply(e / 2).add(1));
  }
}
