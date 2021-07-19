package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016685 Decimal expansion of log(62).
 * @author Sean A. Irvine
 */
public class A016685 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016685() {
    super(CR.valueOf(62).log());
  }
}
