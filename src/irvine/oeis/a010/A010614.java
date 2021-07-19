package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010614 Decimal expansion of cube root of 43.
 * @author Sean A. Irvine
 */
public class A010614 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010614() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(43), CR.ONE_THIRD));
  }
}
