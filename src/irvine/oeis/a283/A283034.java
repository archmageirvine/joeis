package irvine.oeis.a283;

import irvine.oeis.FiniteSequence;

/**
 * A283034 Numbers n such that n = (sum of digits of n)^(last digit of n).
 * @author Georg Fischer
 */
public class A283034 extends FiniteSequence {

  /** Construct the sequence. */
  public A283034() {
    super(1, 4913, 19683, 52521875, 24794911296L, 68719476736L, 271818611107L, 1174711139837L);
  }
}
