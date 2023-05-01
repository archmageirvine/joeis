package irvine.oeis.a361;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361033 a(n) = 3*(4*n)!/(n!*(n+1)!^3).
 * @author Georg Fischer
 */
public class A361033 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361033() {
    super(0, "[[0],[24,-176,384,-256],[1,3,3,1]]", "3", 0);
  }
}
