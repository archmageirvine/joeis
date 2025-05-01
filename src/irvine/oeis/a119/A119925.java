package irvine.oeis.a119;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A119925 Decimal expansion of the value of Minkowski's question mark function at Pi.
 * @author Sean A. Irvine
 */
public class A119925 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A119925() {
    super(0, CrFunctions.MINKOWSKI_QUESTION_MARK.cr(CR.PI), 10, 128);
  }
}
