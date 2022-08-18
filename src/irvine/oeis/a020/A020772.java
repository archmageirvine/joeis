package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020772 Decimal expansion of 1/sqrt(15).
 * @author Sean A. Irvine
 */
public class A020772 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020772() {
    super(0, CR.valueOf(15).sqrt().inverse());
  }
}
