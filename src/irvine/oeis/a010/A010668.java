package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010668 Decimal expansion of cube root of 98.
 * @author Sean A. Irvine
 */
public class A010668 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010668() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(98), CR.ONE_THIRD));
  }
}
