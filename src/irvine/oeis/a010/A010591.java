package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010591 Decimal expansion of cube root of 19.
 * @author Sean A. Irvine
 */
public class A010591 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010591() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.ONE_THIRD));
  }
}
