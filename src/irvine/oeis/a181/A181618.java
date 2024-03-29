package irvine.oeis.a181;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2+1/(1-3*x)-3/sqrt(1-2*x-3*x^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A181618 Number of n-game win/loss/draw series that contain at least one dead game.
 * @author Georg Fischer
 */
public class A181618 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A181618() {
    super(1, "[[0],[9,9],[3,3],[-11,-5],[3,1]]", "[0,0,6,24,90]", 3);
  }
}
