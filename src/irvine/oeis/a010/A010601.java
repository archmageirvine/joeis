package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010601 Decimal expansion of cube root of 30.
 * @author Sean A. Irvine
 */
public class A010601 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010601() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(30), CR.ONE_THIRD));
  }
}
