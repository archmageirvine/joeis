package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010588 Decimal expansion of cube root of 16.
 * @author Sean A. Irvine
 */
public class A010588 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010588() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.ONE_THIRD));
  }
}
