package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010599 Decimal expansion of cube root of 28.
 * @author Sean A. Irvine
 */
public class A010599 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010599() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(28), CR.ONE_THIRD));
  }
}
