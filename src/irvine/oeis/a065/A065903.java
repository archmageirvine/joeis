package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;

/**
 * A065903 Integers i &gt; 1 for which there is no prime p such that i is a solution mod p of x^4 = 2.
 * @author Sean A. Irvine
 */
public class A065903 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065903() {
    super(2, new A065902(), ZERO);
  }
}
