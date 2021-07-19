package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010597 Decimal expansion of cube root of 25.
 * @author Sean A. Irvine
 */
public class A010597 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010597() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(25), CR.ONE_THIRD));
  }
}
