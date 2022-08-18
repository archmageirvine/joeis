package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020801 Decimal expansion of 1/sqrt(44).
 * @author Sean A. Irvine
 */
public class A020801 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020801() {
    super(0, CR.valueOf(44).sqrt().inverse());
  }
}
