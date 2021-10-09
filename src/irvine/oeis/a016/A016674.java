package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016674 Decimal expansion of log(51).
 * @author Sean A. Irvine
 */
public class A016674 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016674() {
    super(CR.valueOf(51).log());
  }
}
