package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016677 Decimal expansion of log(54).
 * @author Sean A. Irvine
 */
public class A016677 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016677() {
    super(CR.valueOf(54).log());
  }
}
