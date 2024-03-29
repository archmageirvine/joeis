package irvine.oeis.a077;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A077457 a(n) = sigma_4(n^4)/sigma_2(n^4).
 * @author Georg Fischer
 */
public class A077457 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A077457() {
    super(1, (p, e) -> p.pow(8L * e + 2).add(1).divide(p.square().add(1)));
  }
}
