package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010593 Decimal expansion of cube root of 21.
 * @author Sean A. Irvine
 */
public class A010593 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010593() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(21), CR.ONE_THIRD));
  }
}
