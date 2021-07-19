package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016699 Decimal expansion of log(76).
 * @author Sean A. Irvine
 */
public class A016699 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016699() {
    super(CR.valueOf(76).log());
  }
}
