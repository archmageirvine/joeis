package irvine.oeis.a322;
// Generated by gen_seq4.pl holos [0,-2,-3,1] [1,2,4] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A322940 a(n) = [x^n] (4*x^2 + x - 1)/(2*x^2 + 3*x - 1).
 * @author Georg Fischer
 */
public class A322940 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322940() {
    super(1, "[0,-2,-3,1]", "[1,2,4]", 0);
  }
}
