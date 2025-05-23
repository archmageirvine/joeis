package irvine.oeis.a356;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002182;

/**
 * A356078 Highly composite numbers that are multiples of their number of divisors.
 * @author Georg Fischer
 */
public class A356078 extends FilterSequence {

  /** Construct the sequence. */
  public A356078() {
    super(1, new A002182(), v -> v.mod(Functions.TAU.z(v)).isZero());
  }
}
