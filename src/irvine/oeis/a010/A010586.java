package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010586 Decimal expansion of cube root of 14.
 * @author Sean A. Irvine
 */
public class A010586 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010586() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.ONE_THIRD));
  }
}
