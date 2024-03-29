package irvine.oeis.a143;
// Generated by gen_seq4.pl etaprod at 2023-01-26 23:27

import irvine.oeis.transform.EtaProductSequence;

/**
 * A143752 Expansion of eta(q^3) * eta(q^4) * eta(q^5) * eta(q^60) / (eta(q) * eta(q^12) * eta(q^15) * eta(q^20)) in powers of q.
 * Eta product <code>eta(q^3)*eta(q^4)*eta(q^5)*eta(q^60)/eta(q)/eta(q^12)/eta(q^15)/eta(q^20)</code>
 * @author Georg Fischer
 */
public class A143752 extends EtaProductSequence {

  /** Construct the sequence. */
  public A143752() {
    super(1, "[60,1;5,1;4,1;3,1;20,-1;15,-1;12,-1;1,-1]");
  }
}
