package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-05-27/holos at 2024-05-28 02:23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A370179 a(n) = floor(x*a(n-1)) for n &gt; 0 where x = (9 + 3*sqrt(13))/2, a(0) = 1.
 * , 10*a(n-1) - 9*a(n-3)
 * @author Georg Fischer
 */
public class A370179 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A370179() {
    super(0, "[[0], [-9], [0], [10], [-1]]", "1, 9, 89", 0, 0);
  }
}
