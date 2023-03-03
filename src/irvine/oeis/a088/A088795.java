package irvine.oeis.a088;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A088795 a(n) = -1/16-3*n^2/8+17*n/12+n^3/12+(-1)^n/16.
 * @author Georg Fischer
 */
public class A088795 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088795() {
    super(1, "[[0],[-1],[3],[-2],[-2],[3],[-1]]", "1,2,3,5", 0);
  }
}
