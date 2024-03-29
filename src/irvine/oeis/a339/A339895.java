package irvine.oeis.a339;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a061.A061395;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A339895 a(n) = A339894(n) - A061395(n).
 * @author Georg Fischer
 */
public class A339895 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A339895() {
    super(1, (n, s) -> s[0].subtract(s[1]), "", new A339894(), new A061395());
  }
}
