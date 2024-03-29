package irvine.oeis.a208;
// Generated by gen_seq4.pl 2024-03-05/tuptraf at 2024-03-06 21:53

import irvine.oeis.a010.A010786;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A208450 Denominator of A010786(n+1) / A010786(n).
 * @author Georg Fischer
 */
public class A208450 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A208450() {
    super(1, (n, s) -> s[0].divide(s[1]), "", new A010786().skip(1), new A208448());
  }
}
