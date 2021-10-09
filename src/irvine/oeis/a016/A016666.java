package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016666 Decimal expansion of log(43).
 * @author Sean A. Irvine
 */
public class A016666 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016666() {
    super(CR.valueOf(43).log());
  }
}
