package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126691 Prime numbers p such that 100-p is also a prime.
 * @author Georg Fischer
 */
public class A126691 extends FiniteSequence {

  /** Construct the sequence. */
  public A126691() {
    super(1, FINITE, 3, 11, 17, 29, 41, 47, 53, 59, 71, 83, 89, 97);
  }
}
