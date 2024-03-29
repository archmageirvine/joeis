package irvine.oeis.a333;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A333602 Number of directed Hamiltonian walks from NW to SW corners of a 6 X n grid.
 * @author Georg Fischer
 */
public class A333602 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A333602() {
    super(1, "[0,2,-4,28,42,-82,-8,118,-66,-35,90,12,-63,14,5,-1]", "1,1,16,47,397,1770,11658,59946,359962,1958968,11341696,63142224,360314940,2024278172,11485023624", 0);
  }
}
