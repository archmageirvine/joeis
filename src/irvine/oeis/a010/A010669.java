package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010669 Decimal expansion of cube root of 99.
 * @author Sean A. Irvine
 */
public class A010669 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010669() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(99), CR.ONE_THIRD));
  }
}
