package irvine.oeis.a086;

import irvine.oeis.InverseSequence;

/**
 * A086428 Permutation of natural numbers induced by the Catalan bijection gma086428 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A086428 extends InverseSequence {

  /** Construct the sequence. */
  public A086428() {
    super(0, 0, new A086427(), 0);
  }
}

