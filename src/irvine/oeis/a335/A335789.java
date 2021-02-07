package irvine.oeis.a335;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A335789 a(n) = time to the nearest second at the n-th instant (n&gt;=0) when the hour and minute hands on a clock face coincide, starting at time 0:00.
 * @author Georg Fischer
 */
public class A335789 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A335789() {
    super(0, "[0,-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,-1]", 
        "[0, 3927, 7855, 11782, 15709, 19636, 23564, 27491, 31418, 35345, 39273, 43200]", 0);
  }
}
