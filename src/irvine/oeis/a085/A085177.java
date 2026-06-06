package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085177 Inverse permutation to A085176.
 * @author Sean A. Irvine
 */
public class A085177 extends InverseSequence {

  /** Construct the sequence. */
  public A085177() {
    super(1, new A085176());
  }
}
