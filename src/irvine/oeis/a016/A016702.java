package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016702 Decimal expansion of log(79).
 * @author Sean A. Irvine
 */
public class A016702 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016702() {
    super(CR.valueOf(79).log());
  }
}
