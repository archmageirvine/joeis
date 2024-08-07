package irvine.oeis.a197;
// Generated by gen_seq4.pl 2024-08-02.ack/decexp at 2024-08-02 23:54

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197070 Decimal expansion of the Dirichlet eta-function at 3.
 * Formula: 3*zeta(3)/4=3*J002117/4
 * @author Georg Fischer
 */
public class A197070 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A197070() {
    super(0, Zeta.zeta(3).multiply(3).divide(4));
  }
}
