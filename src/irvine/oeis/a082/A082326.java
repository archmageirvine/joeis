package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082326 Permutation of natural numbers: A057163-conjugate of A057512.
 * @author Sean A. Irvine
 */
public class A082326 extends InverseSequence {

  /** Construct the sequence. */
  public A082326() {
    super(0, 0, new A082325(), 0);
  }
}
