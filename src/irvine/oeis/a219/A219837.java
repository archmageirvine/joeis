package irvine.oeis.a219;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A219837 Expansion of x^4*(2-10*x+18*x^2-7*x^3-21*x^4+25*x^5-x^6)/((1-x)^3*(1-2*x)^6).
 * @author Georg Fischer
 */
public class A219837 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A219837() {
    super(0, "[0,-64, 384,-1008, 1520,-1452, 912,-377, 99,-15, 1]", "[0, 0, 0, 0, 2, 20, 120, 567, 2320, 8596, 29578]", 0);
  }
}
