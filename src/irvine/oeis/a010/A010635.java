package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010635 Decimal expansion of cube root of 65.
 * @author Sean A. Irvine
 */
public class A010635 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010635() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(65), CR.ONE_THIRD));
  }
}
