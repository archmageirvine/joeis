package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-04-10/tuptraf at 2024-04-10 22:07

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A122055 A Somos 9-type recurrence: a(n) = (3*a(n-1)*a(n-8) - a(n-4)*a(n-5))/a(n-9), with a(0)=...=a(8)=1.
 * @author Georg Fischer
 */
public class A122055 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A122055() {
    super(0, (n, s) -> s[0].multiply(3).multiply(s[7]).subtract(s[3].multiply(s[4])).divide(s[8]), "1, 1, 1, 1, 1, 1, 1, 1, 1", PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS);
  }
}
