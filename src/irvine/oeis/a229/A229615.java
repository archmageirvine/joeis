package irvine.oeis.a229;
// manually etaprod at 2023-01-16 15:04

import irvine.oeis.transform.EtaProductSequence;

/**
 * A229615 Expansion of q^2 * psi(q^3)^6 / psi(q)^2 in powers of q where psi() is a Ramanujan theta function.
 * Eta product <code>((eta(q) * eta(q^6)^6) / (eta(q^2)^2 * eta(q^3)^3))^2</code>
 * @author Georg Fischer
 */
public class A229615 extends EtaProductSequence {

  /** Construct the sequence. */
  public A229615() {
    super(2, "[6,12;1,2;3,-6;2,-4]", "-2");
  }
}
