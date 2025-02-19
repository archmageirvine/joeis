package irvine.oeis.a083;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.z.Z;
import irvine.oeis.a002.A002884;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A083402 Let A_n be the upper triangular matrix in the group GL(n,2) that has zero entries below the main diagonal and 1 elsewhere; a(n) is the size of the conjugacy class of this matrix in GL(n,2).
 * @author Georg Fischer
 */
public class A083402 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A083402() {
    super(1, (term, n) -> term.divide(Z.TWO.pow(n - 1)), "", new A002884());
  }
}
