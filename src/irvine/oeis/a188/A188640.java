package irvine.oeis.a188;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A188640 Decimal expansion of e + sqrt(1+e^2).
 * @author Sean A. Irvine
 */
public class A188640 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188640() {
    super(CR.E.add(CR.ONE.add(CR.E.multiply(CR.E)).sqrt()));
  }
}
