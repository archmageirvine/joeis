package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020790 Decimal expansion of 1/sqrt(33).
 * @author Sean A. Irvine
 */
public class A020790 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020790() {
    super(0, CR.valueOf(33).sqrt().inverse());
  }
}
