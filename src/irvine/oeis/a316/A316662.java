package irvine.oeis.a316;
// Generated by gen_seq4.pl etaprod/etaproq at 2023-01-26 23:27

import irvine.oeis.transform.EtaProductSequence;

/**
 * A316662 Expansion of f(x, x^2) * psi(x^3)^3 in powers of x where psi() is a Ramanujan theta function and f(, ) is Ramanujan's general theta function.
 * Eta product <code>eta(q^2)*eta(q^6)^5/eta(q)/eta(q^3)</code>
 * @author Georg Fischer
 */
public class A316662 extends EtaProductSequence {

  /** Construct the sequence. */
  public A316662() {
    super(0, "[6,5;2,1;3,-1;1,-1]", "-7/6");
  }
}
