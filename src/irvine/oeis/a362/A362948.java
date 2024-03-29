package irvine.oeis.a362;
// Generated by gen_seq4.pl manch5/union2 at 2024-03-12 22:08

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000351;
import irvine.oeis.a033.A033845;

/**
 * A362948 Numbers whose sum of (distinct) prime divisors (A008472) equals 5.
 * @author Georg Fischer
 */
public class A362948 extends UnionSequence {

  /** Construct the sequence. */
  public A362948() {
    super(1, new A000351().skip(1), new A033845());
  }
}
