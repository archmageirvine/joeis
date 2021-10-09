package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010600 Decimal expansion of cube root of 29.
 * @author Sean A. Irvine
 */
public class A010600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010600() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(29), CR.ONE_THIRD));
  }
}
