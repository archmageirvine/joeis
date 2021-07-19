package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019675 Decimal expansion of Pi/8.
 * @author Sean A. Irvine
 */
public class A019675 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019675() {
    super(CR.PI.divide(CR.EIGHT));
  }
}
