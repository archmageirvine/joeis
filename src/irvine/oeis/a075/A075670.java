package irvine.oeis.a075;
// Generated by gen_seq4.pl holos [[0,0,0,384,0,-640,0,-304,0,995,0,-689,0,-1530,0,-666,0,-105,0,-5],[2560]] [1] 0 at 2020-03-14 22:45
// Recurrence: 2560*a[n+0]=(5*n^19+105*n^17+666*n^15+1530*n^13+689*n^11-995*n^9+304*n^7+640*n^5-384*n^3)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A075670 Sum of next n 9th powers.
 * @author Georg Fischer
 */
public class A075670 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A075670() {
    super(1, "[[0,0,0,384,0,-640,0,-304,0,995,0,-689,0,-1530,0,-666,0,-105,0,-5],[2560]]", "[1]", 0);
  }
}
