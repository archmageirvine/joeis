package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016681 Decimal expansion of log(58).
 * @author Sean A. Irvine
 */
public class A016681 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016681() {
    super(CR.valueOf(58).log());
  }
}
