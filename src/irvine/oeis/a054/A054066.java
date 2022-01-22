package irvine.oeis.a054;

import irvine.oeis.PositionSequence;

/**
 * A054066 Position of n-th 1 in A054065.
 * @author Sean A. Irvine
 */
public class A054066 extends PositionSequence {

  /** Construct the sequence. */
  public A054066() {
    super(1, new A054065(), 1);
  }
}
