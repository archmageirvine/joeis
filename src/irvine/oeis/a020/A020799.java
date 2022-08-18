package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020799 Decimal expansion of 1/sqrt(42).
 * @author Sean A. Irvine
 */
public class A020799 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020799() {
    super(0, CR.valueOf(42).sqrt().inverse());
  }
}
