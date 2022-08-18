package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020796 Decimal expansion of 1/sqrt(39).
 * @author Sean A. Irvine
 */
public class A020796 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020796() {
    super(0, CR.valueOf(39).sqrt().inverse());
  }
}
