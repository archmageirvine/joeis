package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010623 Decimal expansion of cube root of 52.
 * @author Sean A. Irvine
 */
public class A010623 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010623() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(52), CR.ONE_THIRD));
  }
}
