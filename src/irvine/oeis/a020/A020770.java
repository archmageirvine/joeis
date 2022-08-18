package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020770 Decimal expansion of 1/sqrt(13).
 * @author Sean A. Irvine
 */
public class A020770 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020770() {
    super(0, CR.valueOf(13).sqrt().inverse());
  }
}
