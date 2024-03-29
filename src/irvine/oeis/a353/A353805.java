package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-03-05/tuptraf at 2024-03-06 21:53

import irvine.oeis.a051.A051027;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A353805 a(n) = A051027(n) / gcd(A051027(n), A353802(n)), where A051027(n) = sigma(sigma(n)), and A353802(n) = Product_{p^e||n} sigma(sigma(p^e)).
 * @author Georg Fischer
 */
public class A353805 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A353805() {
    super(1, (n, s) -> s[0].divide(s[1]), "", new A051027(), new A353804());
  }
}
