package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016650 Decimal expansion of log(27).
 * @author Sean A. Irvine
 */
public class A016650 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016650() {
    super(CR.valueOf(27).log());
  }
}
