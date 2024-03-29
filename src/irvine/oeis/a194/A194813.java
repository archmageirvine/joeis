package irvine.oeis.a194;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a327.A327174;

/**
 * A194813 Number of integers k in [1,n] such that {n*r + k*r} &lt; {n*r - k*r}, where { } = fractional part and r = (1+sqrt(5))/2 (the golden ratio).
 * @author Sean A. Irvine
 */
public class A194813 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194813() {
    super(1, new A327174());
  }
}
