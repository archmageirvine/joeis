package irvine.oeis.a340;
// manually 2023-10-12/simtraf at 2023-10-12 21:42

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A340216 Decimal expansion of the series of the reciprocals of the squares of the positive triangular numbers.
 * @author Georg Fischer
 */
public class A340216 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A340216() {
    super(1, CR.THREE.negate().add(CR.PI.pow(CR.TWO).divide(CR.THREE)).multiply(CR.FOUR));
  }
}