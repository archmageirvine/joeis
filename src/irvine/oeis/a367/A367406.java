package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-27/tuptraf at 2024-03-27 21:37

import irvine.oeis.a268.A268335;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A367406 The exponentially odd numbers (A268335) multiplied by their squarefree kernels (A007947).
 * @author Georg Fischer
 */
public class A367406 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A367406() {
    super(1, (n, s) -> s[0].square().divide(s[1]), "", new A268335(), new A367418());
  }
}
