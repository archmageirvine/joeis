package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068469 Decimal expansion of zeta(Pi).
 * @author Sean A. Irvine
 */
public class A068469 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068469() {
    super(1, CrFunctions.ZETA.cr(CR.PI));
  }
}

