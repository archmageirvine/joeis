package irvine.oeis.a068;

import irvine.oeis.FiniteSequence;

/**
 * A068580 Let phi_m(x) = phi(phi(...(phi(x))...)) m times; sequence gives values of k such that phi_2(k) = tau(k).
 * @author Georg Fischer
 */
public class A068580 extends FiniteSequence {

  /** Construct the sequence. */
  public A068580() {
    super(1, 5, 7, 15, 21, 22, 26, 40, 56, 66, 70, 78, 108, 120, 126, 168, 210);
  }
}
