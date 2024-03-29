package irvine.oeis.a299;
// Generated by gen_seq4.pl manch4/holos at 2024-03-12 13:36

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A299640 a(0) = 0, and for n &gt; 0, (a(n)) gives the indices n for which d(n) &lt; d(k) for k &lt; n, where d is the difference sequence of (cos k + sin k).
 * @author Georg Fischer
 */
public class A299640 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A299640() {
    super(0, "[[0], [0, 0, -47553, -710], [0, 0, 46843, 710]]", "0, 1, 2, 8, 27, 360, 51813, 52523, 53233", 0);
  }
}
