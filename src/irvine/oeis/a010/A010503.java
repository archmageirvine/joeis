package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010503 Decimal expansion of 1/sqrt(2).
 * @author Sean A. Irvine
 */
public class A010503 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010503() {
    super(0, CR.SQRT2.inverse());
  }
}
