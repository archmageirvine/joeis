package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010640 Decimal expansion of cube root of 70.
 * @author Sean A. Irvine
 */
public class A010640 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010640() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(70), CR.ONE_THIRD));
  }
}
