package irvine.oeis.a224;

import irvine.oeis.HolonomicRecurrence;

/**
 * A224508 a(n+2) = a(n+1) + a(n) + A*t^n, with A = 1 and t = -2.
 * @author Georg Fischer
 */
public class A224508 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A224508() {
    super(0, "[[0],[-2],[-3],[1],[1]]", "0, 1, 2", 2);
  }
}
