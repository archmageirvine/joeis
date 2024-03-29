package irvine.oeis.a167;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.oeis.MultiplicativeSequence;

/**
 * A167334 Totally multiplicative sequence with a(p) = 2*(2p+1) = 4p+2 for prime p.
 * @author Georg Fischer
 */
public class A167334 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A167334() {
    super(1, (p, e) -> p.multiply(2).add(+1).multiply2().pow(e));
  }
}
