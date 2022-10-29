package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128005 Numbers n such that (40^n - 1)/39 is prime.
 * @author Georg Fischer
 */
public class A128005 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128005() {
    super("[[39],[40],[-1]]", "[0, 39]", 0, primeDivTest(39));
  }

}
