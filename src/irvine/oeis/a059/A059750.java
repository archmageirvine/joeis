package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A059750 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A059750() {
    super(1, CrFunctions.ZETA.cr(CR.HALF).negate());
  }
}

