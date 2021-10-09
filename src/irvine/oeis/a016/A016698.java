package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016698 Decimal expansion of log(75).
 * @author Sean A. Irvine
 */
public class A016698 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016698() {
    super(CR.valueOf(75).log());
  }
}
