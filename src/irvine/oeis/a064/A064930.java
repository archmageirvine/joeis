package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064930 Inverse square of A034175 considered as a permutation of the nonnegative integers (which it is conjectured to be).
 * @author Sean A. Irvine
 */
public class A064930 extends InverseSequence {

  /** Construct the sequence. */
  public A064930() {
    super(0, new A064929(), 0);
  }
}

