package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010594 Decimal expansion of cube root of 22.
 * @author Sean A. Irvine
 */
public class A010594 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010594() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(22), CR.ONE_THIRD));
  }
}
