package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010621 Decimal expansion of cube root of 50.
 * @author Sean A. Irvine
 */
public class A010621 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010621() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(50), CR.ONE_THIRD));
  }
}
