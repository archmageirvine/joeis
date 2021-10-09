package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010585 Decimal expansion of cube root of 13.
 * @author Sean A. Irvine
 */
public class A010585 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010585() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.ONE_THIRD));
  }
}
