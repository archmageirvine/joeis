package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010624 Decimal expansion of cube root of 53.
 * @author Sean A. Irvine
 */
public class A010624 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010624() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(53), CR.ONE_THIRD));
  }
}
