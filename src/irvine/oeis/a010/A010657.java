package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010657 Decimal expansion of cube root of 87.
 * @author Sean A. Irvine
 */
public class A010657 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010657() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(87), CR.ONE_THIRD));
  }
}
