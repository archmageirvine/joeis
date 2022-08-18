package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019785 Decimal expansion of sqrt(e)/12.
 * @author Sean A. Irvine
 */
public class A019785 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019785() {
    super(0, CR.E.sqrt().divide(CR.valueOf(12)));
  }
}
