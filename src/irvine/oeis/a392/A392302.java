package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392302 Decimal expansion of 2*Pi/(1 + phi^2), where phi = A001622.
 * @author Sean A. Irvine
 */
public class A392302 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392302() {
    super(1, CR.TAU.divide(CR.PHI.square().add(1)));
  }
}

