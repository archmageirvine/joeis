package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016695 Decimal expansion of log(72).
 * @author Sean A. Irvine
 */
public class A016695 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016695() {
    super(CR.valueOf(72).log());
  }
}
