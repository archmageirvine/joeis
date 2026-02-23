package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.a388.A388753;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392358 Decimal expansion of (2 - sqrt(2*sqrt(2) - 2)/(2^2))^2.
 * @author Sean A. Irvine
 */
public class A392358 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392358() {
    super(1, CR.TWO.subtract(new A388753().getCR().divide(4)).square());
  }
}
