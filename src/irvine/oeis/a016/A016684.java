package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016684 Decimal expansion of log(61).
 * @author Sean A. Irvine
 */
public class A016684 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016684() {
    super(CR.valueOf(61).log());
  }
}
