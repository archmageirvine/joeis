package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016655 Decimal expansion of log(32) = 5*log(2).
 * @author Sean A. Irvine
 */
public class A016655 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016655() {
    super(CR.valueOf(32).log());
  }
}
