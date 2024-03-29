package irvine.oeis.a289;
// Generated by gen_seq4.pl 2023-10-25/tuptraf at 2023-10-26 22:15

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A289831 a(n) = A289813(n) + A289814(n).
 * @author Georg Fischer
 */
public class A289831 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A289831() {
    super(0, (n, s) -> s[0].add(s[1]), "", new A289813(), new A289814());
  }
}
