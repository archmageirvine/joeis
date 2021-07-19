package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010602 Decimal expansion of cube root of 31.
 * @author Sean A. Irvine
 */
public class A010602 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010602() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(31), CR.ONE_THIRD));
  }
}
