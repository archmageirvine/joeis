package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085181 Inverse permutation to A085180.
 * @author Sean A. Irvine
 */
public class A085181 extends InverseSequence {

  /** Construct the sequence. */
  public A085181() {
    super(1, new A085180());
  }
}
