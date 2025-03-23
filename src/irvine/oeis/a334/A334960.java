package irvine.oeis.a334;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A334960 Decimal expansion of the distance from (0,0) to the nearest maximum point of y = sin x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A334960 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A334960() {
    super(1, CR.PI.square().add(4).sqrt().divide(2));
  }
}
