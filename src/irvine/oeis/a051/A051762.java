package irvine.oeis.a051;

import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.a085.A085365;

/**
 * A051762 Polygon circumscribing constant: decimal expansion of Product_{n=3..infinity} 1/cos(Pi/n).
 * @author Sean A. Irvine
 */
public class A051762 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051762() {
    super(A085365.KEPLER_BOUWKAMP.inverse());
  }
}
