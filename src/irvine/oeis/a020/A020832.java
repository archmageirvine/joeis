package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020832 Decimal expansion of 1/sqrt(75).
 * @author Sean A. Irvine
 */
public class A020832 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020832() {
    super(0, CR.valueOf(75).sqrt().inverse());
  }
}
