package irvine.oeis.a176;
// manually holol/holos at 2022-08-15 15:37

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A176621 a(n) = 2 + Sum_{k=0..n-1} A176513(4*k+1).
 * @author Georg Fischer
 */
public class A176621 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176621() {
    super(0, "[0, 1,-3, 11,-2,-5,-3, 1]", "2, 3, 4, 11, 40, 157", 0);
  }
}
