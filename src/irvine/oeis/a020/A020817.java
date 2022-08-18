package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020817 Decimal expansion of 1/sqrt(60).
 * @author Sean A. Irvine
 */
public class A020817 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020817() {
    super(0, CR.valueOf(60).sqrt().inverse());
  }
}
