package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016713 Decimal expansion of log(90).
 * @author Sean A. Irvine
 */
public class A016713 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016713() {
    super(CR.valueOf(90).log());
  }
}
