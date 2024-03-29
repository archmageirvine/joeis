package irvine.oeis.a101;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A101748 Decimal expansion of an i^i, namely exp(3*Pi/2).
 * @author Georg Fischer
 */
public class A101748 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A101748() {
    super(3, CR.THREE.multiply(CR.PI).divide(CR.TWO).exp());
  }
}
