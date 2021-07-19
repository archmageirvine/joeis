package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016656 Decimal expansion of log(33).
 * @author Sean A. Irvine
 */
public class A016656 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016656() {
    super(CR.valueOf(33).log());
  }
}
