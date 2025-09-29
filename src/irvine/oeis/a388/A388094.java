package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388094 Decimal expansion of exp(Pi / 8) / sqrt(2).
 * @author Sean A. Irvine
 */
public class A388094 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388094() {
    super(1, CR.PI.divide(8).exp().divide(2).multiply(CR.SQRT2));
  }
}
