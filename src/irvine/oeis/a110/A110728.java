package irvine.oeis.a110;
// Generated by gen_seq4.pl 2023-11-30/tuptraf at 2023-12-03 21:34

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A110728 Digital factorial: a(0) = 1, a(n) = n * (the sum of the digits of a(n-1)).
 * @author Georg Fischer
 */
public class A110728 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A110728() {
    super(0, (n, s) -> Functions.DIGIT_SUM.z(s[0]).multiply(n), "1", PREVIOUS);
  }
}
