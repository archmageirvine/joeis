package irvine.oeis.a286;
// manually etaprod at 2023-01-26 23:27

import irvine.oeis.transform.EtaProductSequence;

/**
 * A286137 Expansion of eta(q) * eta(q^2) * eta(q^15) * eta(q^30) in powers of q.
 * Eta product <code>eta(q)*eta(q^2)*eta(q^15)*eta(q^30)</code>
 * @author Georg Fischer
 */
public class A286137 extends EtaProductSequence {

  /** Construct the sequence. */
  public A286137() {
    super(0, "[30,1;15,1;2,1;1,1]", "0");
  }
}
