package irvine.oeis.a229;
// manually etaprod at 2023-01-16 15:04

import irvine.oeis.transform.EtaProductSequence;

/**
 * A229615 Expansion of q^2 * psi(q^3)^6 / psi(q)^2 in powers of q where psi() is a Ramanujan theta function.
 * Eta product Williams #(q^2) w126: <code>q^(-1/2) * [1,0;2,2;3,0;4,-4;6,-6;12,12])</code>
 * @author Georg Fischer
 */
public class A229615 extends EtaProductSequence {

  /** Construct the sequence. */
  public A229615() {
    super(2, "[1,0;2,2;3,0;4,-4;6,-6;12,12]", "-1/2", 1);
  }
}
