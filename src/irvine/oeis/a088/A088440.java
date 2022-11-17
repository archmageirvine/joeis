package irvine.oeis.a088;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A088440 a(4n) = 4n, otherwise a(n) = 1.
 * @author Georg Fischer
 */
public class A088440 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088440() {
    super(0, "[0,-1, 0, 0, 0, 2, 0, 0, 0,-1]", "0, 1, 1, 1, 4, 1, 1, 1", 0);
  }
}
