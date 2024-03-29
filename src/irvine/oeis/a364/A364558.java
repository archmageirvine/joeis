package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-01-16/tuptraf at 2024-01-19 19:57

import irvine.oeis.a000.A000010;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A364558 a(n) = A364557(n) - A000010(n), where A364557 is the M\u00f6bius transform of A005941, and A000010 (Euler phi) is the M\u00f6bius transform of A000027.
 * @author Georg Fischer
 */
public class A364558 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A364558() {
    super(1, (n, s) -> s[0].subtract(s[1]), "", new A364557(), new A000010());
  }
}
