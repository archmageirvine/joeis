package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072334 Decimal expansion of e^2.
 * @author Sean A. Irvine
 */
public class A072334 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072334() {
    super(CR.TWO.exp());
  }
}
