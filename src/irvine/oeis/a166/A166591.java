package irvine.oeis.a166;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A166591 Totally multiplicative sequence with a(p) = p+3 for prime p.
 * @author Georg Fischer
 */
public class A166591 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A166591() {
    super(1, (p, e) -> p.add(3).pow(e));
  }
}
