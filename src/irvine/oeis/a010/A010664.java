package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010664 Decimal expansion of cube root of 94.
 * @author Sean A. Irvine
 */
public class A010664 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010664() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(94), CR.ONE_THIRD));
  }
}
