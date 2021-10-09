package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016720 Decimal expansion of log(97).
 * @author Sean A. Irvine
 */
public class A016720 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016720() {
    super(CR.valueOf(97).log());
  }
}
