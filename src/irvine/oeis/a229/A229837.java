package irvine.oeis.a229;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A229837 Decimal expansion of Sum_{n&gt;=1} 1/(n*n!).
 * @author Sean A. Irvine
 */
public class A229837 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A229837() {
    super(CrFunctions.EI.cr(CR.ONE).subtract(CR.GAMMA));
  }
}
