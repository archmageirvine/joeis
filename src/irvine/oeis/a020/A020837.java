package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020837 Decimal expansion of 1/sqrt(80) = sqrt(5)/20.
 * @author Sean A. Irvine
 */
public class A020837 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020837() {
    super(0, CR.valueOf(80).sqrt().inverse());
  }
}
