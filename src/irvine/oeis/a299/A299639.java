package irvine.oeis.a299;
// Generated by gen_seq4.pl manch4/holos at 2024-03-12 13:36

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A299639 a(0) = 0, and for n &gt; 0, (a(n)) gives the indices n for which d(n) &gt; d(k) for k &lt; n, where d is the difference sequence of (cos k + sin k).
 * @author Georg Fischer
 */
public class A299639 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A299639() {
    super(0, "[[0], [0, 0, -25019, -355], [0, 0, 24664, 355]]", "0, 4, 5, 52168, 52878, 53588, 54298, 55008, 55718", 0);
  }
}
