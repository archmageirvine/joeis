package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073226 Decimal expansion of e^e.
 * @author Sean A. Irvine
 */
public class A073226 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073226() {
    super(CR.E.exp());
  }
}
