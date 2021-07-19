package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010648 Decimal expansion of cube root of 78.
 * @author Sean A. Irvine
 */
public class A010648 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010648() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(78), CR.ONE_THIRD));
  }
}
