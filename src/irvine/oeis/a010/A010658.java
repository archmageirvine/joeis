package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010658 Decimal expansion of cube root of 88.
 * @author Sean A. Irvine
 */
public class A010658 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010658() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(88), CR.ONE_THIRD));
  }
}
