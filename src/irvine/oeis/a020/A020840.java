package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020840 Decimal expansion of 1/sqrt(83).
 * @author Sean A. Irvine
 */
public class A020840 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020840() {
    super(0, CR.valueOf(83).sqrt().inverse());
  }
}
