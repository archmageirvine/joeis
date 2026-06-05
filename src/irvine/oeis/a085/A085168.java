package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085168 Inverse permutation to A085167.
 * @author Sean A. Irvine
 */
public class A085168 extends InverseSequence {

  /** Construct the sequence. */
  public A085168() {
    super(0, 0, new A085167());
  }
}
