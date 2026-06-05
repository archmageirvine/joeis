package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085166 A057163-conjugate of A085160.
 * @author Sean A. Irvine
 */
public class A085166 extends InverseSequence {

  /** Construct the sequence. */
  public A085166() {
    super(0, 0, new A085165());
  }
}
