package irvine.oeis.a212;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (12-4/sqrt(1-4*x))/(8*sqrt(12*x+2*sqrt(1-4*x)+2))+1/(2*sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212696 Central coefficient of the triangle A097609.
 * @author Georg Fischer
 */
public class A212696 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212696() {
    super(0, "[[0],[648,2052,1728,432],[-5148,-6672,-2628,-312],[1208,542,-107,-53],[1632,1618,532,58],[-432,-348,-92,-8]]", "[1,0,3,4,25,66]", 4);
  }
}
