package irvine.oeis.a328;
// manually 2021-01-27

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A328551 a(n) is the Severi degree for curves of degree n and cogenus 4.
 * @author Georg Fischer
 */
public class A328551 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328551() {
    super(1
      , "[0,-1, 9,-36, 84,-126, 126,-84, 36,-9, 1]"
      , "[0, 0, 0, 666, 36975, 437517, 2667375, 11225145, 37206936, 104285790, 257991042]"
      , 0);
  }
  
}
