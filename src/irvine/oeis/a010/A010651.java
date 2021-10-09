package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010651 Decimal expansion of cube root of 81.
 * @author Sean A. Irvine
 */
public class A010651 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010651() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(81), CR.ONE_THIRD));
  }
}
