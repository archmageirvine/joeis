package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083029.
 * @author Sean A. Irvine
 */
public class A392302 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392302() {
    super(1, CR.TAU.divide(CR.PHI.square().add(1)));
  }
}

