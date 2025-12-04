package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082328 Permutation of natural numbers induced by the contraction of Catalan bijection signature-permutation A082326.
 * @author Sean A. Irvine
 */
public class A082328 extends InverseSequence {

  /** Construct the sequence. */
  public A082328() {
    super(0, 0, new A082327(), 0);
  }
}
