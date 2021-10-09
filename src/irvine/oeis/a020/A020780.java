package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020780 Decimal expansion of 1/sqrt(23).
 * @author Sean A. Irvine
 */
public class A020780 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020780() {
    super(CR.valueOf(23).sqrt().inverse());
  }
}
