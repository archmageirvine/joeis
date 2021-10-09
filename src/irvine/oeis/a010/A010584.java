package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010584 Decimal expansion of cube root of 12.
 * @author Sean A. Irvine
 */
public class A010584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010584() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.ONE_THIRD));
  }
}
