package irvine.oeis.a246;
// Generated by gen_seq4.pl etaprod at 2023-01-26 23:27

import irvine.oeis.transform.EtaProductSequence;

/**
 * A246608 Expansion of phi(-q) * phi(-q^4)^4 in powers of q where phi() is a Ramanujan theta function.
 * Eta product <code>eta(q)^2*eta(q^4)^8/eta(q^2)/eta(q^8)^4</code>
 * @author Georg Fischer
 */
public class A246608 extends EtaProductSequence {

  /** Construct the sequence. */
  public A246608() {
    super(0, "[4,8;1,2;8,-4;2,-1]");
  }
}
