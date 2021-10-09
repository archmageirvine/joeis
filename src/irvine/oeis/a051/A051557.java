package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051557 Decimal expansion of cos(Pi/2 degrees). (Of course, cos(Pi/2 radians) = 0.).
 * @author Sean A. Irvine
 */
public class A051557 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051557() {
    super(0, CR.PI.multiply(CR.PI).divide(CR.valueOf(360)).cos());
  }
}
