package irvine.oeis.a055;
// manually 2021-05-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A055589 Convolution of A049612 with A011782.
 * @author Georg Fischer
 */
public class A055589 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055589() {
    super(0, "[0, 32,-80, 80,-40, 10,-1]", "[0, 1, 6, 26, 96, 321, 1002]", 0);
  }
}
