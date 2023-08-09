package irvine.oeis.a364;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A364145 a(n) is the sum of the first 2*n nonzero n-bonacci numbers.
 * @author Georg Fischer
 */
public class A364145 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A364145() {
    super(0, "[0, 16,-20, 8,-1]", "0, 2, 7, 28", 0);
  }
}
