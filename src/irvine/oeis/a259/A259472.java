package irvine.oeis.a259;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a003.A003319;
import irvine.oeis.a059.A059439;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A259472 Coefficients in an asymptotic expansion of A003319(n)/n! in falling factorials.
 * @author Georg Fischer
 */
public class A259472 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A259472() {
    super(0, (n, s) -> s[0].subtract(s[1].multiply(2)), "1", new A059439().skip(1), new A003319().skip(1));
  }
}
