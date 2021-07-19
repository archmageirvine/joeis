package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010634 Decimal expansion of cube root of 63.
 * @author Sean A. Irvine
 */
public class A010634 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010634() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(63), CR.ONE_THIRD));
  }
}
