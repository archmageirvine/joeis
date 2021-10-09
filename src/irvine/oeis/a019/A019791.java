package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019791 Decimal expansion of sqrt(e)/18.
 * @author Sean A. Irvine
 */
public class A019791 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019791() {
    super(-1, CR.E.sqrt().divide(CR.valueOf(18)));
  }
}
