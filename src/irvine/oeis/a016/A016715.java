package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016715 Decimal expansion of log(92).
 * @author Sean A. Irvine
 */
public class A016715 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016715() {
    super(CR.valueOf(92).log());
  }
}
