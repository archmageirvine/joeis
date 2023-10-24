package irvine.oeis.a245;

import irvine.oeis.FilterSequence;
import irvine.oeis.a243.A243071;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A245611 Permutation of natural numbers: a(n) = A243071(A064216(n)).
 * @author Georg Fischer
 */
public class A245611 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A245611() {
    // a(1) = 0, and for n > 1, a(n) = (1/2) * (A243071((2*n)-1) - 1).
    super(1, new FilterSequence(1, new A243071(), (n, v) -> (n & 1) == 1), v -> v.add(-1).divide2());
  }
}
