package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A391674 Decimal expansion of sqrt(2-sqrt(2-sqrt(2))).
 * @author Sean A. Irvine
 */
public class A391674 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A391674() {
    super(1, CR.SQRT2.negate().add(2).sqrt().negate().add(2).sqrt());
  }
}
