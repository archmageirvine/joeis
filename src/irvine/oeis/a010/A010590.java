package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010590 Decimal expansion of cube root of 18.
 * @author Sean A. Irvine
 */
public class A010590 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010590() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.ONE_THIRD));
  }
}
