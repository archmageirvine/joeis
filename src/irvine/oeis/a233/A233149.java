package irvine.oeis.a233;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A233149 a(n) = ((n^2+1)^3) - s, where s is the nearest square to (n^2+1)^3.
 * Lin.rec. signature: (0, 4, 0,-6, 0, 4, 0,-1)
 * @author Georg Fischer
 */
public class A233149 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A233149() {
    super(1, "[0,-1, 0, 4, 0,-6, 0, 4, 0,-1]", "-1, 4,-24, 13,-113, 28,-316, 49,-681, 76,-1256, 109,-2089, 148", 0);
  }
}
