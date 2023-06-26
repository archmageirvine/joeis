package irvine.oeis.a108;

import irvine.oeis.FiniteSequence;

/**
 * A108491 Smallest prime with a run of n strictly decreasing digits.
 * @author Georg Fischer
 */
public class A108491 extends FiniteSequence {

  /** Construct the sequence. */
  public A108491() {
    super(1, FINITE, 2, 31, 421, 5431, 75431, 764321, 8764321, 97654321, 9765432101L, 198765432101L);
  }
}
