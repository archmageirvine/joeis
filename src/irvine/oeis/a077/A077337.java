package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A077337 Numbers k such that k and R(k) both are squarefree where R(n) (A004086) is the digit reversal of n.
 * @author Sean A. Irvine
 */
public class A077337 extends FilterSequence {

  /** Construct the sequence. */
  public A077337() {
    super(1, new A005117(), k -> Predicates.SQUARE_FREE.is(Functions.REVERSE.z(k)));
  }
}
