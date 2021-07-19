package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016689 Decimal expansion of log(66).
 * @author Sean A. Irvine
 */
public class A016689 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016689() {
    super(CR.valueOf(66).log());
  }
}
