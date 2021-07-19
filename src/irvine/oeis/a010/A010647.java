package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010647 Decimal expansion of cube root of 77.
 * @author Sean A. Irvine
 */
public class A010647 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010647() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(77), CR.ONE_THIRD));
  }
}
