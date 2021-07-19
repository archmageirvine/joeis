package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016649 Decimal expansion of log(26).
 * @author Sean A. Irvine
 */
public class A016649 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016649() {
    super(CR.valueOf(26).log());
  }
}
