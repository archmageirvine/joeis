package irvine.oeis.a069;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.oeis.MultiplicativeSequence;

/**
 * A069091 Jordan function J_6(n).
 * @author Georg Fischer
 */
public class A069091 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A069091() {
    super(1, (p, e) -> p.pow(6L * e).subtract(p.pow(6L * (e - 1))));
  }
}
