package irvine.oeis.a173;
// Generated by gen_seq4.pl 2024-06-24/sintrif at 2024-06-24 23:40

import irvine.oeis.a011.A011762;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A173216 a(n) is the result of multiplying n by the number of letters of the name in Spanish.
 * @author Georg Fischer
 */
public class A173216 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A173216() {
    super(1, (term, n) -> term.multiply(n), "", new A011762());
  }
}
