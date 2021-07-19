package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016659 Decimal expansion of log(36).
 * @author Sean A. Irvine
 */
public class A016659 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016659() {
    super(CR.valueOf(36).log());
  }
}
