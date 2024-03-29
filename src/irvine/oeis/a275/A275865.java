package irvine.oeis.a275;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-07 21:51

import irvine.math.q.Q;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A275865 Floor(r*a(n-1)) - floor(r*a(n-2)), where r = 3/2, a(0) = 1, a(1) = 1.
 * @author Georg Fischer
 */
public class A275865 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A275865() {
    super(0, (n, s) -> {
      final Q r = new Q(3, 2);
      return r.multiply(s[0]).floor().subtract(r.multiply(s[1]).floor());
    }, "1, 1", PREVIOUS, PREVIOUS);
  }
}
