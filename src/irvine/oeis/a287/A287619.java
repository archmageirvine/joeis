package irvine.oeis.a229;
// manually etaprod at 2023-01-16 15:04

import irvine.oeis.transform.EtaProductSequence;

/**
 * A229615 Expansion of q^2 * psi(q^3)^6 / psi(q)^2 in powers of q where psi() is a Ramanujan theta function.
 * Eta product <code>q^(-5) * (eta(q^2) * eta(q^78))^2 / (eta(q) * eta(q^39))</code>
 * @author Georg Fischer
 */
public class A287619 extends EtaProductSequence {

  /** Construct the sequence. */
  public A287619() {
    super(0, "[2, 2;78, 2;1,-1;39,-1]", "-1/1", 1);
  }
}
