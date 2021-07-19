package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016657 Decimal expansion of log(34).
 * @author Sean A. Irvine
 */
public class A016657 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016657() {
    super(CR.valueOf(34).log());
  }
}
