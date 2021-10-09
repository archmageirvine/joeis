package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016663 Decimal expansion of log(40).
 * @author Sean A. Irvine
 */
public class A016663 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016663() {
    super(CR.valueOf(40).log());
  }
}
