package irvine.oeis.a049;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A049860 a(n) = Sum{a(k): k=0,1,2,...,n-4,n-2,n-1}; a(n-3) is not a summand; initial terms are 0,1,4.
 * @author Georg Fischer
 */
public class A049860 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A049860() {
    super(0, "[0,-1, 1, 0,-2, 1]", "[0, 1, 4, 5]", 0);
  }
}
