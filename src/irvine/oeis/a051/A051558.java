package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A051558 Decimal expansion of sin(Pi/2 degrees). (Of course, sin(Pi/2 radians) = 1.).
 * @author Sean A. Irvine
 */
public class A051558 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051558() {
    super(0, CR.PI.multiply(CR.PI).divide(CR.valueOf(360)).sin());
  }
}
