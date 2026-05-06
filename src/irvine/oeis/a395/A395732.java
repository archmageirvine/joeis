package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084713.
 * @author Sean A. Irvine
 */
public class A395732 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395732() {
    super(1, ComputableReals.SINGLETON.atan(CR.TWO).multiply(15).divide(CR.TAU));
  }
}
