package irvine.oeis.a099;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-03 21:34

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A099941 a(0) = 4; for n&gt;0, a(n) = a(n-1)^2 - 10.
 * @author Georg Fischer
 */
public class A099941 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A099941() {
    super(0, (n, s) -> s[0].square().subtract(10), "4", PREVIOUS);
  }
}
