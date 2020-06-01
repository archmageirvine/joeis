package irvine.oeis.a014;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000217;

/**
 * A014132 Complement of triangular numbers <code>(A000217);</code> also array <code>T(n,k) = ((n+k)^2 + n-k)/2</code>, n, k <code>&gt; 0</code>, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A014132 extends ComplementSequence {

  /** Construct the sequence. */
  public A014132() {
    super(new A000217());
  }
}
