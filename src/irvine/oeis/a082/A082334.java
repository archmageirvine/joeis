package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082334 Permutation of natural numbers induced by the composition of involutions A082313 and A057163.
 * @author Sean A. Irvine
 */
public class A082334 extends InverseSequence {

  /** Construct the sequence. */
  public A082334() {
    super(0, 0, new A082333(), 0);
  }
}
