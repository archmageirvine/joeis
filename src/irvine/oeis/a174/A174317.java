package irvine.oeis.a174;
// Generated by gen_seq4.pl holos [0,2,-3,1] [1,2,1,5,12] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A174317 a(0)=1, a(1)=2, a(2)=1; for n&gt;2, a(n) = 7*2^(n-3)-2.
 * @author Georg Fischer
 */
public class A174317 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A174317() {
    super(1, "[0,2,-3,1]", "[1,2,1,5,12]", 0);
  }
}
