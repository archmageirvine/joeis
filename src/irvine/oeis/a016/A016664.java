package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016664 Decimal expansion of log(41).
 * @author Sean A. Irvine
 */
public class A016664 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016664() {
    super(CR.valueOf(41).log());
  }
}
