package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010609 Decimal expansion of cube root of 38.
 * @author Sean A. Irvine
 */
public class A010609 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010609() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(38), CR.ONE_THIRD));
  }
}
