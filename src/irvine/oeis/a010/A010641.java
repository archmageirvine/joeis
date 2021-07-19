package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010641 Decimal expansion of cube root of 71.
 * @author Sean A. Irvine
 */
public class A010641 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010641() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(71), CR.ONE_THIRD));
  }
}
