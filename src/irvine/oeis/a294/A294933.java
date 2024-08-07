package irvine.oeis.a294;
// Generated by gen_seq4.pl 2024-08-01.ack/pairtr at 2024-08-01 22:21

import irvine.oeis.transform.PairTransformSequence;

/**
 * A294933 Compound filter related to base-3 expansion of the exponents in prime factorization of n: a(n) = P(A294932(n), A294931(n)), where P(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A294933 extends PairTransformSequence {

  /** Construct the sequence. */
  public A294933() {
    super(1, new A294932(), new A294931());
  }
}
