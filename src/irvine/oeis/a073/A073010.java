package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073010 Decimal expansion of Pi/sqrt(27).
 * @author Sean A. Irvine
 */
public class A073010 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073010() {
    super(CR.PI.divide(CR.valueOf(27).sqrt()));
  }
}
