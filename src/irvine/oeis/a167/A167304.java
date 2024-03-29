package irvine.oeis.a167;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.oeis.MultiplicativeSequence;

/**
 * A167304 Totally multiplicative sequence with a(p) = 3*(p+2) for prime p.
 * @author Georg Fischer
 */
public class A167304 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A167304() {
    super(1, (p, e) -> p.add(+2).multiply(3).pow(e));
  }
}
