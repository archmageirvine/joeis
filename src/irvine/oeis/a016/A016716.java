package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016716 Decimal expansion of log(93).
 * @author Sean A. Irvine
 */
public class A016716 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016716() {
    super(CR.valueOf(93).log());
  }
}
