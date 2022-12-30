package irvine.oeis.a147;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A147535 a(n) = 2*4^n+4*3^n-2^n.
 * @author Georg Fischer
 */
public class A147535 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A147535() {
    super(0, "[[0],[24],[-26],[9],[-1]]", "5, 18, 64", 0);
  }
}
