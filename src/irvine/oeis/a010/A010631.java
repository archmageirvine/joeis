package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010631 Decimal expansion of cube root of 60.
 * @author Sean A. Irvine
 */
public class A010631 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010631() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(60), CR.ONE_THIRD));
  }
}
