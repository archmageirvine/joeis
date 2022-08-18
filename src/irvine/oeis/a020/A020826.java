package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020826 Decimal expansion of 1/sqrt(69).
 * @author Sean A. Irvine
 */
public class A020826 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020826() {
    super(0, CR.valueOf(69).sqrt().inverse());
  }
}
