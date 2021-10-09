package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020833 Decimal expansion of 1/sqrt(76).
 * @author Sean A. Irvine
 */
public class A020833 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020833() {
    super(CR.valueOf(76).sqrt().inverse());
  }
}
