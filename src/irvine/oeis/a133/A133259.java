package irvine.oeis.a133;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A133259 a(6n) = 6n+1, a(6n+1) = 6n+2, a(6n+2) = 6n+3, a(6n+3) = 6n+6, a(6n+4) = 6n+5, a(6n+5) = 6n+4.
 * @author Georg Fischer
 */
public class A133259 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A133259() {
    super(0, "[[0],[-1],[2],[-2],[2],[-2],[2],[-1]]", "1, 2, 3, 6, 5, 4", 0);
  }
}
