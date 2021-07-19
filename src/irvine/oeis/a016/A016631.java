package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016631 Decimal expansion of log(8).
 * @author Sean A. Irvine
 */
public class A016631 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016631() {
    super(CR.EIGHT.log());
  }
}
