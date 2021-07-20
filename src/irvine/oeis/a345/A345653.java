package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A345653 Decimal expansion of (sqrt(2) + arcsinh(1))/4.
 * @author Sean A. Irvine
 */
public class A345653 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A345653() {
    super(0, CR.SQRT2.add(ComputableReals.SINGLETON.asinh(CR.ONE)).divide(CR.FOUR));
  }
}
