package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085179 Inverse permutation to A085178.
 * @author Sean A. Irvine
 */
public class A085179 extends InverseSequence {

  /** Construct the sequence. */
  public A085179() {
    super(1, new A085178());
  }
}
