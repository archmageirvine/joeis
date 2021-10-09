package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010666 Decimal expansion of cube root of 96.
 * @author Sean A. Irvine
 */
public class A010666 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010666() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(96), CR.ONE_THIRD));
  }
}
