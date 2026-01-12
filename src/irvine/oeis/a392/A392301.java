package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392301 Decimal expansion of 360/(1 + phi^2), where phi = A001622.
 * @author Sean A. Irvine
 */
public class A392301 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392301() {
    super(2, CR.valueOf(360).divide(CR.PHI.square().add(1)));
  }
}

