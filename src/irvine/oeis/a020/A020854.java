package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020854 Decimal expansion of 1/sqrt(97).
 * @author Sean A. Irvine
 */
public class A020854 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020854() {
    super(CR.valueOf(97).sqrt().inverse());
  }
}
