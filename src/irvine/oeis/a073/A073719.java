package irvine.oeis.a073;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a033.A033844;
import irvine.oeis.a065.A065856;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A073719 a(n) = floor(prime(2^n)/composite(2^n)).
 * @author Georg Fischer
 */
public class A073719 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A073719() {
    super(1, (n, s) -> s[0].divide(s[1]), "", new A033844().skip(1), new A065856().skip(1));
  }
}
