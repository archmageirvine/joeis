package irvine.oeis.a361;
// Generated by gen_seq4.pl multm/mult at 2023-03-28 18:24

import irvine.oeis.MultiplicativeSequence;

/**
 * A361264 Multiplicative with a(p^e) = p^(e + 2), e &gt; 0.
 * @author Georg Fischer
 */
public class A361264 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A361264() {
    super(1, (p, e) -> p.pow(e + 2));
  }
}
