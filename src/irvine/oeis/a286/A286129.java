package irvine.oeis.a286;
// manually etaprod at 2023-01-26 23:27

import irvine.oeis.transform.EtaProductSequence;

/**
 * A286129 Expansion of eta(q^3) * eta(q^4) * eta(q^5) * eta(q^60) in powers of q.
 * Eta product <code>eta(q^3)*eta(q^4)*eta(q^5)*eta(q^60)</code>
 * @author Georg Fischer
 */
public class A286129 extends EtaProductSequence {

  /** Construct the sequence. */
  public A286129() {
    super(0, "[60,1;5,1;4,1;3,1]", "0");
  }
}
