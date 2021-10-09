package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020841 Decimal expansion of 1/sqrt(84).
 * @author Sean A. Irvine
 */
public class A020841 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020841() {
    super(CR.valueOf(84).sqrt().inverse());
  }
}
