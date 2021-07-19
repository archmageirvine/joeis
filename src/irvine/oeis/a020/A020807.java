package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020807 Decimal expansion of 1/sqrt(50).
 * @author Sean A. Irvine
 */
public class A020807 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020807() {
    super(CR.valueOf(50).sqrt().inverse());
  }
}
