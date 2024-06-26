package irvine.oeis.a275;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A275647 Decimal expansion of Pi^2/6 - Sum_{k&gt;=1} 1/prime(k)^2.
 * Formula:
 * @author Georg Fischer
 */
public class A275647 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A275647() {
    super(1, CR.PI.multiply(CR.PI).divide(CR.SIX).subtract(Zeta.zetap(2)));
  }
}
