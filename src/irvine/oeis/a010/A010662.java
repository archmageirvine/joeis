package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010662 Decimal expansion of cube root of 92.
 * @author Sean A. Irvine
 */
public class A010662 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010662() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(92), CR.ONE_THIRD));
  }
}
