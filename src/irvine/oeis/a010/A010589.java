package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010589 Decimal expansion of cube root of 17.
 * @author Sean A. Irvine
 */
public class A010589 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010589() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.ONE_THIRD));
  }
}
