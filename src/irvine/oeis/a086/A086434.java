package irvine.oeis.a086;

import irvine.oeis.InverseSequence;

/**
 * A086434 Contraction-permutation of A085170: a(n) = A082853(A085170(A081291(n))).
 * @author Sean A. Irvine
 */
public class A086434 extends InverseSequence {

  /** Construct the sequence. */
  public A086434() {
    super(0, 0, new A086433(), 0);
  }
}

