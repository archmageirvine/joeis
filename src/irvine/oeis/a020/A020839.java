package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020839 Decimal expansion of 1/sqrt(82).
 * @author Sean A. Irvine
 */
public class A020839 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020839() {
    super(0, CR.valueOf(82).sqrt().inverse());
  }
}
