package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010626 Decimal expansion of cube root of 55.
 * @author Sean A. Irvine
 */
public class A010626 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010626() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(55), CR.ONE_THIRD));
  }
}
