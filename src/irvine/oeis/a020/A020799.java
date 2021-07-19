package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020799 Decimal expansion of 1/sqrt(42).
 * @author Sean A. Irvine
 */
public class A020799 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020799() {
    super(CR.valueOf(42).sqrt().inverse());
  }
}
