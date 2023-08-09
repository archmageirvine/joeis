package irvine.oeis.a089;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089985 a(n) = A089709(n+1)/A089709(n).
 * @author Georg Fischer
 */
public class A089985 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089985() {
    super(1, "[0,-2, 3,-1]", "2, 3, 6, 10", 0);
  }
}
