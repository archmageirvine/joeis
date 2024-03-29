package irvine.oeis.a166;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.oeis.MultiplicativeSequence;

/**
 * A166666 Totally multiplicative sequence with a(p) = 8p+1 for prime p.
 * @author Georg Fischer
 */
public class A166666 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A166666() {
    super(1, (p, e) -> p.multiply(8).add(+1).pow(e));
  }
}
