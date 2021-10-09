package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010653 Decimal expansion of cube root of 83.
 * @author Sean A. Irvine
 */
public class A010653 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010653() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(83), CR.ONE_THIRD));
  }
}
