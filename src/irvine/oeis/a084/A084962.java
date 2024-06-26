package irvine.oeis.a084;
// Generated by gen_seq4.pl 2023-11-28/tuptraf at 2023-11-29 22:39

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A084962 Iterations of the Fibonacci sequence starting at 6.
 * @author Georg Fischer
 */
public class A084962 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A084962() {
    super(0, (n, s) -> Functions.FIBONACCI.z(s[0]), "6", PREVIOUS);
  }
}
