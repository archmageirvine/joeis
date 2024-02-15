package irvine.oeis.a070;
// manually 2024-02-13/tuptraf at 2024-02-13 14:36

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A070871 a(n) = A002487(n) * A002487(n+1) (Conway's alimentary function).
 * @author Georg Fischer
 */
public class A070871 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A070871() {
    super(1, (n, s) -> s[0].multiply(s[1]), "", new A002487(), PREVIOUS);
    next();
  }
}
