package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020774 Decimal expansion of 1/sqrt(17).
 * @author Sean A. Irvine
 */
public class A020774 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020774() {
    super(CR.valueOf(17).sqrt().inverse());
  }
}
