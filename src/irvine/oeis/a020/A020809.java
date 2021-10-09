package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020809 Decimal expansion of 1/sqrt(52).
 * @author Sean A. Irvine
 */
public class A020809 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020809() {
    super(CR.valueOf(52).sqrt().inverse());
  }
}
