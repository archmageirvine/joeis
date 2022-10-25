package irvine.oeis.a072;
// manually holsig2/holos at 2022-10-25 21:49

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A072836 Exponents occurring in expansion of F_10(q^2).
 * @author Georg Fischer
 */
public class A072836 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A072836() {
    super(0, "[0,-1,1,0,0,0,0,1,-1]", "0,9,16,20,21,24,25,29", 0);
  }
}
