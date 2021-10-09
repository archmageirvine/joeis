package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010581 Decimal expansion of cube root of 9.
 * @author Sean A. Irvine
 */
public class A010581 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010581() {
    super(ComputableReals.SINGLETON.pow(CR.NINE, CR.ONE_THIRD));
  }
}
