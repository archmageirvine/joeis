package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010633 Decimal expansion of cube root of 62.
 * @author Sean A. Irvine
 */
public class A010633 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010633() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(62), CR.ONE_THIRD));
  }
}
