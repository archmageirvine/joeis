package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019774 Decimal expansion of sqrt(e).
 * @author Sean A. Irvine
 */
public class A019774 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019774() {
    super(CR.E.sqrt());
  }
}
