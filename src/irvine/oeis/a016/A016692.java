package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016692 Decimal expansion of log(69).
 * @author Sean A. Irvine
 */
public class A016692 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016692() {
    super(CR.valueOf(69).log());
  }
}
