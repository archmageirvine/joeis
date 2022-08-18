package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020822 Decimal expansion of 1/sqrt(65).
 * @author Sean A. Irvine
 */
public class A020822 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020822() {
    super(0, CR.valueOf(65).sqrt().inverse());
  }
}
