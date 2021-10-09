package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020797 Decimal expansion of 1/sqrt(40).
 * @author Sean A. Irvine
 */
public class A020797 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020797() {
    super(CR.valueOf(40).sqrt().inverse());
  }
}
