package irvine.oeis.a161;
// Generated by gen_seq4.pl 2023-11-25/filter at 2023-11-26 00:04

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A161902 Non-palindromic squares whose digit reversal gives a square (possibly with fewer digits).
 * @author Georg Fischer
 */
public class A161902 extends FilterSequence {

  /** Construct the sequence. */
  public A161902() {
    super(1, new A000290(), v -> {
      final Z w = Functions.REVERSE.z(v);
      return w.isSquare() && !Predicates.PALINDROME.is(10, v);
    });
  }
}
