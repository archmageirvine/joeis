package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010659 Decimal expansion of cube root of 89.
 * @author Sean A. Irvine
 */
public class A010659 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010659() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(89), CR.ONE_THIRD));
  }
}
