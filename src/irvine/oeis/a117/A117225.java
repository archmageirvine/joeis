package irvine.oeis.a117;
// Generated by gen_seq4.pl 2023-09-18/filter at 2023-09-18 23:12

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A117225 Primes of the form f(n) = 9*n^4 - 444*n^3 + 8059*n^2 - 63714*n + 185371 listed by increasing value of n &gt;= 0.
 * @author Georg Fischer
 */
public class A117225 extends FilterSequence {

  /** Construct the sequence. */
  public A117225() {
    super(1, new LambdaSequence(0, n -> (((Z.NINE.multiply(n).subtract(444)).multiply(n).add(8059)).multiply(n).subtract(63714)).multiply(n).add(185371)), PRIME);
  }
}
