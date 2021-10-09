package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016647 Decimal expansion of log(24).
 * @author Sean A. Irvine
 */
public class A016647 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016647() {
    super(CR.valueOf(24).log());
  }
}
