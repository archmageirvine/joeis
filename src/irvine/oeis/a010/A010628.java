package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010628 Decimal expansion of cube root of 57.
 * @author Sean A. Irvine
 */
public class A010628 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010628() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(57), CR.ONE_THIRD));
  }
}
