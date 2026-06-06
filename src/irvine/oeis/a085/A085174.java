package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085174 Permutation of natural numbers induced by the Catalan bijection gma085174 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085174 extends InverseSequence {

  /** Construct the sequence. */
  public A085174() {
    super(0, 0, new A085173());
  }
}
