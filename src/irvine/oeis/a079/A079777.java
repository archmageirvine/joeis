package irvine.oeis.a079;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-03 21:34

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A079777 a(0) = 0, a(1) = 1; for n &gt; 1, a(n) = (a(n-1) + a(n-2)) (mod n).
 * @author Georg Fischer
 */
public class A079777 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A079777() {
    super(0, (n, s) -> s[0].add(s[1]).modZ(n), "0, 1", PREVIOUS, PREVIOUS);
  }
}
