package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010644 Decimal expansion of cube root of 74.
 * @author Sean A. Irvine
 */
public class A010644 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010644() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(74), CR.ONE_THIRD));
  }
}
