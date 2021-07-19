package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010615 Decimal expansion of cube root of 44.
 * @author Sean A. Irvine
 */
public class A010615 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010615() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(44), CR.ONE_THIRD));
  }
}
