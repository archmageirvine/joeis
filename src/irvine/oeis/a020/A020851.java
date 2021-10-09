package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020851 Decimal expansion of 1/sqrt(94).
 * @author Sean A. Irvine
 */
public class A020851 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020851() {
    super(CR.valueOf(94).sqrt().inverse());
  }
}
