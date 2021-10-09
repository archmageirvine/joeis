package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010617 Decimal expansion of cube root of 46.
 * @author Sean A. Irvine
 */
public class A010617 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010617() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(46), CR.ONE_THIRD));
  }
}
