package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019755 Decimal expansion of e/18.
 * @author Sean A. Irvine
 */
public class A019755 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019755() {
    super(0, CR.E.divide(CR.valueOf(18)));
  }
}
