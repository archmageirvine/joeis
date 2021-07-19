package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010661 Decimal expansion of cube root of 91.
 * @author Sean A. Irvine
 */
public class A010661 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010661() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(91), CR.ONE_THIRD));
  }
}
