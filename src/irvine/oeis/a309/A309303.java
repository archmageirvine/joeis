package irvine.oeis.a309;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (sqrt(x+1)-sqrt(1-3*x))/(2*(x+1)^(3/2))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309303 Expansion of g.f. (sqrt(x+1) - sqrt(1-3*x))/(2*(x+1)^(3/2)).
 * @author Georg Fischer
 */
public class A309303 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309303() {
    super(0, "[[0],[3,3],[5,5],[-1,1],[-3,-1]]", "[0,1,-1,2,-1]", 3);
  }
}
