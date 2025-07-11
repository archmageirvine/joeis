package irvine.oeis.a086;
// Generated by gen_seq4.pl 2025-05-26.ack/filnum at 2025-05-26 23:11

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A086486 Numbers n such that the sum of the distinct prime divisors divides rad(n)=A007947(n).
 * @author Georg Fischer
 */
public class A086486 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086486() {
    super(1, 2, k -> Functions.RAD.z(k).mod(Functions.SOPF.z(k)).isZero());
  }
}
