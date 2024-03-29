package irvine.oeis.a114;
// Generated by gen_seq4.pl 2023-12-01/tuptraf at 2023-12-03 21:34

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A114375 a(n) = (a(n-1) XOR a(n-2)) + 1, a(0) = a(1) = 0.
 * @author Georg Fischer
 */
public class A114375 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A114375() {
    super(0, (n, s) -> s[0].xor(s[1]).add(1), "0, 0", PREVIOUS, PREVIOUS);
  }
}
