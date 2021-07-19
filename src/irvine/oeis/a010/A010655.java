package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010655 Decimal expansion of cube root of 85.
 * @author Sean A. Irvine
 */
public class A010655 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010655() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(85), CR.ONE_THIRD));
  }
}
