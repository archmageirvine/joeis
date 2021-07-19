package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016637 Decimal expansion of log(14).
 * @author Sean A. Irvine
 */
public class A016637 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016637() {
    super(CR.valueOf(14).log());
  }
}
