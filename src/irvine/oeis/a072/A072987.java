package irvine.oeis.a072;
// Generated by gen_seq4.pl 2023-11-13/tuptraf at 2023-11-17 15:02

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A072987 FIBMOD numbers: a(1) = a(2) = 1, a(n) = a(n-1) mod (n-1) + a(n-2) mod (n-2).
 * @author Georg Fischer
 */
public class A072987 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A072987() {
    super(1, (n, s) -> s[0].modZ(n - 1).add(s[1].modZ(n - 2)), "1,1", PREVIOUS, PREVIOUS);
  }
}
