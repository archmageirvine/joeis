package irvine.oeis.a247;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-07 21:51

import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A247525 a(n) = 5 * a(n-1) - 2 * a(n-1)^2 / a(n-2), with a(0) = 1, a(1) = 2.
 * @author Georg Fischer
 */
public class A247525 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A247525() {
    super(0, (n, s) -> s[0].multiply(5).subtract(Z.TWO.multiply(s[0].square()).divide(s[1])), "1, 2", PREVIOUS, PREVIOUS);
  }
}
