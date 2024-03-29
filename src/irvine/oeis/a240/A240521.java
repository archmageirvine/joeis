package irvine.oeis.a240;
// Generated by gen_seq4.pl 2024-02-13/tuptraf at 2024-02-13 21:05

import irvine.oeis.a050.A050376;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A240521 a(n) = A050376(n)*A050376(n+1) where A050376(n) is the n-th number of the form p^(2^k) with p is prime and k &gt;= 0.
 * @author Georg Fischer
 */
public class A240521 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A240521() {
    super(1, (n, s) -> s[0].multiply(s[1]), "", new A050376(), PREVIOUS);
  }
}
