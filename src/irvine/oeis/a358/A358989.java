package irvine.oeis.a358;
// manually 2024-03-08

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A358989 Decimal expansion of 13*sqrt(146)/50.
 * @author Georg Fischer
 */
public class A358989 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A358989() {
    super(0, CR.valueOf(13).multiply(CR.valueOf(146).sqrt()).divide(CR.valueOf(50)));
  }
}
