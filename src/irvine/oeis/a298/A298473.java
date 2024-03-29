package irvine.oeis.a298;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A298473 a(n) = n * lambda(n) * 2^omega(n).
 * @author Georg Fischer
 */
public class A298473 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A298473() {
    super(1, (p, e) -> p.negate().pow(e).multiply2());
  }
}
