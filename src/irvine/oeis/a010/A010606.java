package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010606 Decimal expansion of cube root of 35.
 * @author Sean A. Irvine
 */
public class A010606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010606() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(35), CR.ONE_THIRD));
  }
}
