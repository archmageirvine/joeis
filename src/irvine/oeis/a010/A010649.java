package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010649 Decimal expansion of cube root of 79.
 * @author Sean A. Irvine
 */
public class A010649 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010649() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(79), CR.ONE_THIRD));
  }
}
