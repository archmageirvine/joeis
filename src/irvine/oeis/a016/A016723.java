package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016723 Decimal expansion of log(100).
 * @author Sean A. Irvine
 */
public class A016723 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016723() {
    super(CR.valueOf(100).log());
  }
}
