package irvine.oeis.a283;
// manually at 2022-08-15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A283049 Numbers of configurations of A'Campo forests with co-dimension 1 and degree n&gt;0.
 * @author Georg Fischer
 */
public class A283049 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A283049() {
    super(0, "[[0],[24,-176, 384,-256],[-12,-48,-27, 27]]", "[0, 4]", -1);
  }
}
