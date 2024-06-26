package irvine.oeis.a071;
// Generated by gen_seq4.pl 2023-11-13/tuptraf at 2023-11-17 15:02

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A071424 a(n) = a(n-1) + number of decimal digits of n!. Number of decimal digits of concatenation of first n factorials.
 * @author Georg Fischer
 */
public class A071424 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A071424() {
    super(1, (n, s) -> s[0].add(Functions.FACTORIAL.z(n).toString().length()), "1", PREVIOUS);
  }
}
