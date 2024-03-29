package irvine.oeis.a175;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A175926 Sum of divisors of cubes.
 * @author Georg Fischer
 */
public class A175926 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A175926() {
    super(1, (p, e) -> p.pow(3L * e + 1).subtract(1).divide(p.subtract(1)));
  }
}
