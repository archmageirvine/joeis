package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010596 Decimal expansion of cube root of 24.
 * @author Sean A. Irvine
 */
public class A010596 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010596() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(24), CR.ONE_THIRD));
  }
}
