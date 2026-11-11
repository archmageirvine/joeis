package irvine.oeis.a280;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A280149 Numbers k such that 3^k - 2^k is not squarefree.
 * @author Sean A. Irvine
 */
public class A280149 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A280149() {
    super(1, k -> !Predicates.SQUARE_FREE.is(Z.THREE.pow(k).subtract(Z.ONE.shiftLeft(k))));
  }
}
