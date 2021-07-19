package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020832 Decimal expansion of 1/sqrt(75).
 * @author Sean A. Irvine
 */
public class A020832 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020832() {
    super(CR.valueOf(75).sqrt().inverse());
  }
}
