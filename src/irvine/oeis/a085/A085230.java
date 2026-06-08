package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085230 Inverse of A085229.
 * @author Sean A. Irvine
 */
public class A085230 extends InverseSequence {

  /** Construct the sequence. */
  public A085230() {
    super(1, new A085229());
  }
}
