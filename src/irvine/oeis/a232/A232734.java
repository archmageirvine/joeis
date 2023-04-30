package irvine.oeis.a232;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A232734 Decimal expansion of Integral {x=0..infinity} 1/2^(2^x) dx.
 * @author Sean A. Irvine
 */
public class A232734 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A232734() {
    super(0, CR.LOG2.negate().ei().negate().divide(CR.LOG2));
  }
}
