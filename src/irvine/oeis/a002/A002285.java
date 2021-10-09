package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002285 Decimal expansion of common logarithm of e.
 * @author Sean A. Irvine
 */
public class A002285 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002285() {
    super(CR.TEN.log().inverse());
  }
}
