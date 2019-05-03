package irvine.oeis.a283;

import irvine.oeis.FiniteSequence;

/**
 * A283034 Numbers n such that <code>n =</code> (sum of digits of <code>n)^(last</code> digit of <code>n)</code>.
 * @author Georg Fischer
 */
public class A283034 extends FiniteSequence {

  /** Construct the sequence. */
  public A283034() {
    super(1, 4913, 19683, 52521875, 24794911296L, 68719476736L, 271818611107L, 1174711139837L);
  }
}
