package irvine.oeis.a147;
// manually 2021-10-19

import irvine.oeis.triangle.Triangle;

/**
 * A147644 Triangle read by rows: T(n, k) = binomial(n, k) if n &lt; 3, otherwise T(n, k) = binomial(n, k) + 2*binomial(n-2, k-1).
 * @author Georg Fischer
 */
public class A147644 extends Triangle {

  /** Construct the sequence. */
  public A147644() {
    super("1, 1, 1, 1, 2, 1, 1, 5, 5, 1");
  }
}

