package irvine.oeis.a322;
// manually A350522/holos at 2022-07-18 17:01

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A322288 Indices n for which the partial sums of sin(k) (0 &lt;= k &lt;= n) reach a new minimum.
 * @author Georg Fischer
 */
public class A322288 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322288() {
    super(0, "[[0],[4449,-710],[-5159, 710]]", "0, 6, 12, 56, 100, 144, 188, 521", 0);
  }
}
