package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010663 Decimal expansion of cube root of 93.
 * @author Sean A. Irvine
 */
public class A010663 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010663() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(93), CR.ONE_THIRD));
  }
}
