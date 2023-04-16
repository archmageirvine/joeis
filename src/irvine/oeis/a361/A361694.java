package irvine.oeis.a361;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A361694 Decimal expansion of (2 - phi)/3, with phi being the golden ratio A001622.
 * @author Sean A. Irvine
 */
public class A361694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A361694() {
    super(0, CR.TWO.subtract(CR.PHI).divide(CR.THREE));
  }
}
