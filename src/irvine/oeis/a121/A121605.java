package irvine.oeis.a121;
// Generated by gen_seq4.pl 2025-04-28.ack/filprof at 2025-04-28 23:36

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A121605 Primes of the form (Fibonacci[n+3] + 2) = A018910[n], Pisot sequence L(4,5).
 * @author Georg Fischer
 */
public class A121605 extends FilterSequence {

  /** Construct the sequence. */
  public A121605() {
    super(1, new LambdaSequence(0, k -> Functions.FIBONACCI.z(k + 3).add(2)), PRIME);
  }
}
