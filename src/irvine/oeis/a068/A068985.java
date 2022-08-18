package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068985 Decimal expansion of 1/e.
 * @author Sean A. Irvine
 */
public class A068985 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068985() {
    super(0, CR.E.inverse());
  }
}
