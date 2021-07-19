package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010627 Decimal expansion of cube root of 56.
 * @author Sean A. Irvine
 */
public class A010627 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010627() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(56), CR.ONE_THIRD));
  }
}
