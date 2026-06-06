package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085172 Inverse permutation to A085171.
 * @author Sean A. Irvine
 */
public class A085172 extends InverseSequence {

  /** Construct the sequence. */
  public A085172() {
    super(0, 0, new A085171());
  }
}
