package irvine.oeis.a202;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A202337 Range of A062723.
 * @author Georg Fischer
 */
public class A202337 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A202337() {
    super(1, "[0, 3,-1]", "1, 2, 6, 12", 0);
  }
}
