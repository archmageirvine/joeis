package irvine.oeis.a035;
// Generated by gen_seq4.pl psipsik_epsig/etaproq at 2023-02-02 00:14

import irvine.oeis.transform.EtaProductSequence;

/**
 * A035162 Number of positive odd solutions to equation x^2 + 7y^2 = 8n.
 * Eta product <code>psi(q) * psi(q^7)</code>
 * @author Georg Fischer
 */
public class A035162 extends EtaProductSequence {

  /** Construct the sequence. */
  public A035162() {
    super(1, "[14,2;2,2;7,-1;1,-1]", "-1/1");
  }
}
