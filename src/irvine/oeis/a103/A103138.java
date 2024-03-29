package irvine.oeis.a103;
// Generated by gen_seq4.pl holon at 2023-12-26 21:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A103138 Second column of inverse of Delannoy triangle.
 * -1/2*(3/2+1/2*x-1/2*(x^2+6*x+1)^(1/2))*(1+x-(x^2+6*x+1)^(1/2))
 * @author Georg Fischer
 */
public class A103138 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A103138() {
    super(0, "[[0],[30,-21,3],[138,-95,17],[0,3,-3],[0,1,-1]]", "0,1,-3,10,-38,158", 0, OGF);
  }
}
