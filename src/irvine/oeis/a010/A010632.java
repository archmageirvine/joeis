package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010632 Decimal expansion of cube root of 61.
 * @author Sean A. Irvine
 */
public class A010632 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010632() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(61), CR.ONE_THIRD));
  }
}
