package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010660 Decimal expansion of cube root of 90.
 * @author Sean A. Irvine
 */
public class A010660 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010660() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(90), CR.ONE_THIRD));
  }
}
