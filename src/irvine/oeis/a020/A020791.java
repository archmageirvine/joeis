package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020791 Decimal expansion of 1/sqrt(34).
 * @author Sean A. Irvine
 */
public class A020791 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020791() {
    super(0, CR.valueOf(34).sqrt().inverse());
  }
}
