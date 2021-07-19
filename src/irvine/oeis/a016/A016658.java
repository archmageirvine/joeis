package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016658 Decimal expansion of log(35).
 * @author Sean A. Irvine
 */
public class A016658 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016658() {
    super(CR.valueOf(35).log());
  }
}
