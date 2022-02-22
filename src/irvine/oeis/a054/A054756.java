package irvine.oeis.a054;

import irvine.oeis.SetDifferenceSequence;

/**
 * A054756 Numbers k such that phi(k) and cototient(k) are squares but k is not in A054755.
 * @author Sean A. Irvine
 */
public class A054756 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A054756() {
    super(new A054754(), new A054755());
  }
}
