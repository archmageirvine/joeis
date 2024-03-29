package irvine.oeis.a334;
// Generated by gen_seq4.pl 2024-03-05/tuptraf at 2024-03-06 21:53

import irvine.oeis.a329.A329697;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A334873 a(n) = A329697(n) * A334204(n).
 * @author Georg Fischer
 */
public class A334873 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A334873() {
    super(1, (n, s) -> s[0].multiply(s[1]), "", new A329697(), new A334204().skip(1));
  }
}
