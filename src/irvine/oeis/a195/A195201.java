package irvine.oeis.a195;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1] [1,11,37,29,23,233,2333,23333,661,601,6011,6679,997,907,313,241,2411,47,53,41,137,17,59,599,857,953,9533,13619,19457,821] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A195201 a(n) is the largest prime factor of the number made by taking the previous term and duplicating the final digit, a(1) = 1.
 * @author Georg Fischer
 */
public class A195201 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A195201() {
    super(1, "[0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", "[1,11,37,29,23,233,2333,23333,661,601,6011,6679,997,907,313,241,2411,47,53,41,137,17,59,599,857,953,9533,13619,19457,821]", 0);
  }
}
