package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010637 Decimal expansion of cube root of 67.
 * @author Sean A. Irvine
 */
public class A010637 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010637() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(67), CR.ONE_THIRD));
  }
}
