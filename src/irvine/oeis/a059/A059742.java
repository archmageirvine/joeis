package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A059742 Decimal expansion of e + Pi.
 * @author Sean A. Irvine
 */
public class A059742 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A059742() {
    super(CR.PI.add(CR.E));
  }
}
