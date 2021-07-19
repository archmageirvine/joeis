package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010622 Decimal expansion of cube root of 51.
 * @author Sean A. Irvine
 */
public class A010622 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010622() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(51), CR.ONE_THIRD));
  }
}
