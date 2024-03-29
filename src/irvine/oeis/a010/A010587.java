package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010587 Decimal expansion of cube root of 15.
 * @author Sean A. Irvine
 */
public class A010587 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010587() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.ONE_THIRD));
  }
}
