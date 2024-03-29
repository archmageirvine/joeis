package irvine.oeis.a083;
// Generated by gen_seq4.pl manch4/tuptraf at 2024-03-12 13:36

import irvine.math.z.Z;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A083258 a(n) = gcd(A046523(n), n).
 * @author Georg Fischer
 */
public class A083258 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A083258() {
    super(1, (n, s) -> s[0].gcd(Z.valueOf(n)), "1", new A046523().skip(1));
  }
}
