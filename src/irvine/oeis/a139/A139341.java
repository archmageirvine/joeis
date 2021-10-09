package irvine.oeis.a139;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A139341 Decimal expansion of e^((1+sqrt(5))/2).
 * @author Sean A. Irvine
 */
public class A139341 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A139341() {
    super(CR.PHI.exp());
  }
}
