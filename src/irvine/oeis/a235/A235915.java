package irvine.oeis.a235;
// Generated by gen_seq4.pl 2023-12-01/tuptraf at 2023-12-03 21:34

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A235915 a(1) = 1, a(n) = a(n-1) + (digsum(a(n-1)) mod 5) + 1, digsum = A007953.
 * @author Georg Fischer
 */
public class A235915 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A235915() {
    super(1, (n, s) -> s[0].add(Functions.DIGIT_SUM.l(s[0]) % 5 + 1), "1", PREVIOUS);
  }
}
