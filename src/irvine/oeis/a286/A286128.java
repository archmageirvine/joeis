package irvine.oeis.a286;
// manually etaprod at 2023-01-26 23:27

import irvine.oeis.transform.EtaProductSequence;

/**
 * A286128 Expansion of eta(q) * eta(q^12) * eta(q^15) * eta(q^20) in powers of q.
 * Eta product <code>eta(q)*eta(q^12)*eta(q^15)*eta(q^20)</code>
 * @author Georg Fischer
 */
public class A286128 extends EtaProductSequence {

  /** Construct the sequence. */
  public A286128() {
    super(0, "[20,1;15,1;12,1;1,1]", "0");
  }
}
