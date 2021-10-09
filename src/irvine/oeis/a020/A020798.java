package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020798 Decimal expansion of 1/sqrt(41).
 * @author Sean A. Irvine
 */
public class A020798 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020798() {
    super(CR.valueOf(41).sqrt().inverse());
  }
}
