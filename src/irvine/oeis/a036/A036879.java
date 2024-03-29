package irvine.oeis.a036;
// Generated by gen_seq4.pl mult3/mult at 2022-07-19 22:09

import irvine.oeis.MultiplicativeSequence;

/**
 * A036879 If n = (p_1)^(m_1)...(p_k)^(m_k) then a(n) = (p_1)^((p_1)^(m_1) - 1)...(p_k)((p_k)^(m_k) - 1).
 * @author Georg Fischer
 */
public class A036879 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A036879() {
    super(1, (p, e) -> p.pow(p.pow(e).subtract(1)));
  }
}
