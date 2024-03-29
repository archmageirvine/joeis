package irvine.oeis.a263;
// Generated by gen_seq4.pl etaprod at 2023-01-26 23:27

import irvine.oeis.transform.EtaProductSequence;

/**
 * A263767 Expansion of phi(-x) * psi(-x^8) * chi(x^24) in powers of x where phi(), psi(), chi() are Ramanujan theta functions.
 * Eta product <code>eta(q)^2*eta(q^8)*eta(q^32)*eta(q^48)^2/eta(q^2)/eta(q^16)/eta(q^24)/eta(q^96)</code>
 * @author Georg Fischer
 */
public class A263767 extends EtaProductSequence {

  /** Construct the sequence. */
  public A263767() {
    super(0, "[48,2;32,1;8,1;1,2;96,-1;24,-1;16,-1;2,-1]");
  }
}
