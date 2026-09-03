package irvine.oeis.a086;

import irvine.oeis.InverseSequence;

/**
 * A086430 Permutation of natural numbers induced by the Catalan bijection gma086430 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A086430 extends InverseSequence {

  /** Construct the sequence. */
  public A086430() {
    super(0, 0, new A086429(), 0);
  }
}

