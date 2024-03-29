package irvine.oeis.a258;
// Generated by gen_seq4.pl 2023-12-08/tuptraf at 2023-12-08 18:44

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A258161 a(n) = a(n-1)^3/a(n-2) with a(0)=1, a(1)=2.
 * @author Georg Fischer
 */
public class A258161 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A258161() {
    super(0, (n, s) -> s[0].pow(3).divide(s[1]), "1,2", PREVIOUS, PREVIOUS);
  }
}
