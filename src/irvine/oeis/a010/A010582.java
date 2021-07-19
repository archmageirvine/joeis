package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010582 Decimal expansion of cube root of 10.
 * @author Sean A. Irvine
 */
public class A010582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010582() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.ONE_THIRD));
  }
}
