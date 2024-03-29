package irvine.oeis.a192;
// Generated by gen_seq4.pl manch4/tuptraf at 2024-03-12 13:36

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A192264 a(1)=1, a(2)=2; a(n) = abs((n-1)*a(n-1) - n*a(n-2)), n &gt; 2.
 * @author Georg Fischer
 */
public class A192264 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A192264() {
    super(1, (n, s) -> s[0].multiply(n - 1).subtract(s[1].multiply(n)).abs(), "1, 2", PREVIOUS, PREVIOUS);
  }
}
