package irvine.oeis.a127;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A127996 Numbers n such that (21^n - 1)/20 is prime.
 * @author Georg Fischer
 */
public class A127996 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A127996() {
    super("[[20],[21],[-1]]", "[0, 20]", 0, primeDivTest(20));
  }

}
