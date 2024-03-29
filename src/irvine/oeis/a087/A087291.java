package irvine.oeis.a087;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A087291 Number of pairs of polynomials (f,g) in GF(2)[x] satisfying 1 &lt;= deg(f) &lt;= n, 1 &lt;= deg(g) &lt;= n and gcd(f,g) = 1.
 * @author Georg Fischer
 */
public class A087291 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A087291() {
    super(0, new long[] {0, 2, 4},
      new long[] {1, -7, 14, -8});
  }
}
