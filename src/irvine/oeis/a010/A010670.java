package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010670 Decimal expansion of cube root of 100.
 * @author Sean A. Irvine
 */
public class A010670 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010670() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(100), CR.ONE_THIRD));
  }
}
