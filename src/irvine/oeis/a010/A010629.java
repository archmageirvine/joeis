package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010629 Decimal expansion of cube root of 58.
 * @author Sean A. Irvine
 */
public class A010629 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010629() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(58), CR.ONE_THIRD));
  }
}
