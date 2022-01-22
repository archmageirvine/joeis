package irvine.oeis.a054;

import irvine.oeis.PositionOfNSequence;

/**
 * A054075 Position of first appearance of n in A054073.
 * @author Sean A. Irvine
 */
public class A054075 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A054075() {
    super(new A054073());
  }
}
