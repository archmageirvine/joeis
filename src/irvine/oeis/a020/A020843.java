package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020843 Decimal expansion of 1/sqrt(86).
 * @author Sean A. Irvine
 */
public class A020843 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020843() {
    super(0, CR.valueOf(86).sqrt().inverse());
  }
}
