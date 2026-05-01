package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395281 Decimal expansion of tan(3 * Pi / 13).
 * @author Sean A. Irvine
 */
public class A395281 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395281() {
    super(0, CR.PI.multiply(3).divide(13).tan());
  }
}
