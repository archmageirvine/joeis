package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010630 Decimal expansion of cube root of 59.
 * @author Sean A. Irvine
 */
public class A010630 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010630() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(59), CR.ONE_THIRD));
  }
}
