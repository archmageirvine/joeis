package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020853 Decimal expansion of 1/sqrt(96).
 * @author Sean A. Irvine
 */
public class A020853 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020853() {
    super(CR.valueOf(96).sqrt().inverse());
  }
}
