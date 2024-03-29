package irvine.oeis.a167;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.oeis.MultiplicativeSequence;

/**
 * A167310 Totally multiplicative sequence with a(p) = 9*(p+2) for prime p.
 * @author Georg Fischer
 */
public class A167310 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A167310() {
    super(1, (p, e) -> p.add(+2).multiply(9).pow(e));
  }
}
