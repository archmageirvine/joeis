package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002390 Decimal expansion of natural logarithm of golden ratio.
 * @author Sean A. Irvine
 */
public class A002390 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002390() {
    super(0, CR.PHI.log());
  }
}
