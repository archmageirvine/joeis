package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010636 Decimal expansion of cube root of 66.
 * @author Sean A. Irvine
 */
public class A010636 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010636() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(66), CR.ONE_THIRD));
  }
}
