package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020827 Decimal expansion of 1/sqrt(70).
 * @author Sean A. Irvine
 */
public class A020827 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020827() {
    super(0, CR.valueOf(70).sqrt().inverse());
  }
}
