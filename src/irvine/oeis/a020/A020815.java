package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020815 Decimal expansion of 1/sqrt(58).
 * @author Sean A. Irvine
 */
public class A020815 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020815() {
    super(0, CR.valueOf(58).sqrt().inverse());
  }
}
