package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010665 Decimal expansion of cube root of 95.
 * @author Sean A. Irvine
 */
public class A010665 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010665() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(95), CR.ONE_THIRD));
  }
}
