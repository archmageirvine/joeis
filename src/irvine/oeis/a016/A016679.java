package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016679 Decimal expansion of log(56).
 * @author Sean A. Irvine
 */
public class A016679 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016679() {
    super(CR.valueOf(56).log());
  }
}
