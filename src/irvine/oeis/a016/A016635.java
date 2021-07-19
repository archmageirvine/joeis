package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016635 Decimal expansion of log(12).
 * @author Sean A. Irvine
 */
public class A016635 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016635() {
    super(CR.valueOf(12).log());
  }
}
