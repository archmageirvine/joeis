package irvine.oeis.a348;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a000.A000720;
import irvine.oeis.a055.A055460;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A348841 Number of primes with even exponents &gt;= 2 in the prime power factorization of n!, for n &gt;= 1.
 * @author Georg Fischer
 */
public class A348841 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A348841() {
    super(1, (n, s) -> s[0].subtract(s[1]), "", new A000720(), new A055460());
  }
}
