package irvine.oeis.a154;
// Generated by gen_seq4.pl holos [0,-6,-3,1] [1,1,5] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A154964 a(n) = 3*a(n-1) + 6*a(n-2), n&gt;2, a(0)=1, a(1)=1, a(2)=5.
 * @author Georg Fischer
 */
public class A154964 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A154964() {
    super(1, "[0,-6,-3,1]", "[1,1,5]", 0);
  }
}
