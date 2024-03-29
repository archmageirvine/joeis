package irvine.oeis.a166;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.oeis.MultiplicativeSequence;

/**
 * A166649 Totally multiplicative sequence with a(p) = 9*(p+1) for prime p.
 * @author Georg Fischer
 */
public class A166649 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A166649() {
    super(1, (p, e) -> p.add(+1).multiply(9).pow(e));
  }
}
