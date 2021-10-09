package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010603 Decimal expansion of cube root of 32.
 * @author Sean A. Irvine
 */
public class A010603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010603() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(32), CR.ONE_THIRD));
  }
}
