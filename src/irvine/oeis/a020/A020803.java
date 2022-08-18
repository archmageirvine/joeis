package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020803 Decimal expansion of 1/sqrt(46).
 * @author Sean A. Irvine
 */
public class A020803 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020803() {
    super(0, CR.valueOf(46).sqrt().inverse());
  }
}
