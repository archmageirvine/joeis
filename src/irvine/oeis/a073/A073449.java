package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073449 Decimal expansion of cot(1).
 * @author Sean A. Irvine
 */
public class A073449 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073449() {
    super(CR.ONE.cos().divide(CR.ONE.sin()));
  }
}
