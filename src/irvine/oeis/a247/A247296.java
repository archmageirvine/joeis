package irvine.oeis.a247;
// manually dfinite/holos at 2022-07-30 10:17

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A247296 Number of uhd and uHd in all weighted lattice paths B(n).
 * Recurrence +(n-1)*(202*n-903)*a(n) +(-250*n^2+1095*n-691)*a(n-1) +(-510*n^2+4095*n-8039)*a(n-2) +(-558*n^2+4287*n-7831)*a(n-3) +(-106*n^2+1587*n-4575)*a(n-4) +(154*n-547)*(n-7)*a(n-5)=0.
 * @author Georg Fischer
 */
public class A247296 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A247296() {
    super(0, "[[0],[3829,-1625, 154],[-4575, 1587,-106],[-7831, 4287,-558],[-8039, 4095,-510],[-691, 1095,-250],[903,-1105, 202]]", "0, 0, 0, 0, 1, 3, 7", 0);
  }
}
