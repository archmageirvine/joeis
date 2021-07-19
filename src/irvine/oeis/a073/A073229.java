package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073229 Decimal expansion of e^(1/e).
 * @author Sean A. Irvine
 */
public class A073229 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073229() {
    super(CR.E.inverse().exp());
  }
}
