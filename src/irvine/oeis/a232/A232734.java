package irvine.oeis.a232;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A232734 Decimal expansion of Integral {x=0..infinity} 1/2^(2^x) dx.
 * @author Sean A. Irvine
 */
public class A232734 extends DecimalExpansionSequence {

  private static final CR LOG2 = CR.TWO.log();

  /** Construct the sequence. */
  public A232734() {
    super(LOG2.negate().ei().negate().divide(LOG2));
  }
}
