package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020800 Decimal expansion of 1/sqrt(43).
 * @author Sean A. Irvine
 */
public class A020800 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020800() {
    super(CR.valueOf(43).sqrt().inverse());
  }
}
