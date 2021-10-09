package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016661 Decimal expansion of log(38).
 * @author Sean A. Irvine
 */
public class A016661 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016661() {
    super(CR.valueOf(38).log());
  }
}
