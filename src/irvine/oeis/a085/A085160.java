package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085160 Permutation of natural numbers induced by the Catalan bijection gma085160 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085160 extends InverseSequence {

  /** Construct the sequence. */
  public A085160() {
    super(0, 0, new A085159());
  }
}
