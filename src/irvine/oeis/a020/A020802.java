package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020802 Decimal expansion of 1/sqrt(45).
 * @author Sean A. Irvine
 */
public class A020802 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020802() {
    super(CR.valueOf(45).sqrt().inverse());
  }
}
