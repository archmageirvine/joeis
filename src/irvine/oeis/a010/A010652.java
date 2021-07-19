package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010652 Decimal expansion of cube root of 82.
 * @author Sean A. Irvine
 */
public class A010652 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010652() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(82), CR.ONE_THIRD));
  }
}
